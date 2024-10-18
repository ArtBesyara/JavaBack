package ru.mireaproject.kb9.dto;

import lombok.Data;
import ru.mireaproject.kb9.entity.Questions;

import java.util.List;

@Data
public class QuestionsDTO {
    private long id;
    private String question;
    private List<String> answers;
    private String correctAnswer;

    public static QuestionsDTO from(Questions question) {
        QuestionsDTO questionsDTO = new QuestionsDTO();
        questionsDTO.setId(question.getId());
        questionsDTO.setQuestion(question.getQuestion());
        questionsDTO.setAnswers(question.getAnswers());
        questionsDTO.setCorrectAnswer(question.getCorrectAnswer());
        return questionsDTO;
    }

    public Questions toQuestions(){
        Questions questions = new Questions();
        questions.setId(this.id);
        questions.setQuestion(this.question);
        questions.setAnswers(this.answers);
        questions.setCorrectAnswer(this.correctAnswer);

        return questions;

    }
}
