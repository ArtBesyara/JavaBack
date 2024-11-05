package ru.mireaproject.kb9.entity.Test;


import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.*;

@Entity
@Table(name = "questions")
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "question", nullable = false)
    private String question;

    @ElementCollection
    @CollectionTable(name = "question_answers", joinColumns = @JoinColumn(name = "question_id"))
    @Column(name = "answer", nullable = false) 
    private List<String> answers;

    @Column(name = "correctAnswer", nullable = false)
    private String correctAnswer;

    public Questions(){
    }

    public Questions(String question, List<String> answers, String correctAnswer){
        this.question = question;
        this.answers = new ArrayList<>(answers);
        this.correctAnswer = correctAnswer;
    }


    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return this.id;
    }
    

    public void setQuestion(String question){
        this.question = question;
    }

    public String getQuestion(){
        return this.question;
    }

    public void setAnswers(List<String> answer){
        this.answers = answer;
    }

    public List<String> getAnswers(){
        return this.answers;
    }

    public void setCorrectAnswer(String correctAnswer){
        this.correctAnswer = correctAnswer;
    }
    public String getCorrectAnswer(){
        return this.correctAnswer;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "question='" + question + '\'' +
                ", answers=" + answers +
                '}';
    }
}
