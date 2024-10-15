package ru.mireaproject.kb9.model;




public class Questions {

    private String question;
    private Answers answers;

    public Questions(){
    }

    public Questions(String question, Answers answers){
        this.question = question;
        this.answers = answers;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public String getQuestion(){
        return this.question;
    }

    public void setAnswers(Answers answer){
        this.answers = answer;
    }

    public Answers getAnswers(){
        return this.answers;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "question='" + question + '\'' +
                ", answers=" + answers +
                '}';
    }
}
