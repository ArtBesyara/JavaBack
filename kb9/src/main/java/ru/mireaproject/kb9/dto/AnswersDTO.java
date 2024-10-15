package ru.mireaproject.kb9.dto;

import java.util.List;

import lombok.Data;
import ru.mireaproject.kb9.model.Answers;

@Data
public class AnswersDTO {
    private List<String> answers;

    public static AnswersDTO from(Answers answers) {
        AnswersDTO answersDTO = new AnswersDTO();
        answersDTO.setAnswers(answers.getAnswers());
        return answersDTO;
    }
}
