package ru.mireaproject.kb9.dto;

import lombok.Data;
import ru.mireaproject.kb9.model.Questions;

@Data
public class QuestionsDTO {
    private String question;
    private AnswersDTO answers;

    public static QuestionsDTO from(Questions question) {
        QuestionsDTO questionsDTO = new QuestionsDTO();
        questionsDTO.setQuestion(question.getQuestion());
        questionsDTO.setAnswers(AnswersDTO.from(question.getAnswers()));
        return questionsDTO;
    }
}
