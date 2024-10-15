package ru.mireaproject.kb9.model;

import java.util.List;
import java.util.ArrayList;

public class Answers {
    private List<String> answers;


    public Answers(){
        this.answers = new ArrayList<>();
    }

    public Answers(List<String> answers){
        this.answers = new ArrayList<>(answers);
    }

    public void setAnswers(List<String> answers){
        this.answers = answers;
    }

    public List<String> getAnswers(){
        return this.answers;
    }

    @Override
    public String toString() {
        return "Answers{" +
                "answers=" + answers +
                '}';
    }

}
