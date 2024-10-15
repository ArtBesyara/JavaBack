package ru.mireaproject.kb9.model;

import java.util.List;
import java.util.ArrayList;



public class Tests {

    private String nameTest;
    private List<Questions> questions;

    public Tests(){
    }

    public Tests(String nameTest, List<Questions> questions){
        this.nameTest = nameTest;
        this.questions = new ArrayList<>(questions);
    }

    public void setNameTest(String nameTest){
        this.nameTest = nameTest;
    }

    public String getNameTest(){
        return this.nameTest;
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
                ", questions=" + questions +
                '}';
    }
}