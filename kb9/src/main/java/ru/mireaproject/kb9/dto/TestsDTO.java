package ru.mireaproject.kb9.dto;

import lombok.Data;
import ru.mireaproject.kb9.model.Tests;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class TestsDTO {
    private String nameTest;
    private List<QuestionsDTO> questions;

    public static TestsDTO from(Tests test) {
        TestsDTO testsDTO = new TestsDTO();
        testsDTO.setNameTest(test.getNameTest());
        testsDTO.setQuestions(
            test.getQuestions().stream()
                .map(QuestionsDTO::from)
                .collect(Collectors.toList())
        );
        return testsDTO;
    }
}

