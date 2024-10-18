package ru.mireaproject.kb9.entity;

import java.util.List;

import jakarta.persistence.*;
import java.util.ArrayList;


@Entity
@Table(name = "tests")
public class Tests {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nameTest")
    private String nameTest;

    @Enumerated(EnumType.STRING)
    @Column(name = "difficultyLevel")
    private DifficultyLevel difficultyLevel;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id")  
    private List<Questions> questions;

    public Tests(){
    }

    public Tests(String nameTest, DifficultyLevel difficultyLevel, List<Questions> questions){
        this.nameTest = nameTest;
        this.difficultyLevel = difficultyLevel;
        this.questions = new ArrayList<>(questions);
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return this.id;
    }
    

    public void setNameTest(String nameTest){
        this.nameTest = nameTest;
    }

    public String getNameTest(){
        return this.nameTest;
    }


    public void setDifficultyLevel(DifficultyLevel difficultyLevel){
        this.difficultyLevel = difficultyLevel;
    }   

    public DifficultyLevel getDifficultyLevel(){
        return this.difficultyLevel;
    }

    public void setQuestions(List<Questions> questions){
        this.questions = questions;
    }

    public List<Questions> getQuestions(){
        return this.questions;
    }

    @Override
    public String toString() {
        return "Tests{" +
                "nameTest='" + nameTest + '\'' +
                "enumLevel='" + difficultyLevel + '\'' +
                "questions='" + questions + '\'' +
                '}';
    }
}