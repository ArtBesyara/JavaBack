package ru.mireaproject.kb9.dto.Test;

import lombok.Data;
import ru.mireaproject.kb9.entity.Test.DifficultyLevel;
import ru.mireaproject.kb9.entity.Test.Questions;
import ru.mireaproject.kb9.entity.Test.Tests;

import java.util.List;
import java.util.stream.Collectors;



@Data
public class TestsDTO {
    private long id;
    private String nameTest;
    private DifficultyLevel difficultyLevel;
    private List<QuestionsDTO> questions;

    public static TestsDTO from(Tests test) {
        TestsDTO testsDTO = new TestsDTO();
        testsDTO.setId(test.getId());
        testsDTO.setNameTest(test.getNameTest());
        testsDTO.setDifficultyLevel(test.getDifficultyLevel());
        testsDTO.setQuestions(
            test.getQuestions().stream()
                .map(QuestionsDTO::from)
                .collect(Collectors.toList())
        );
        return testsDTO;
    }

    public Tests toTests(){
        List<Questions> questions = this.questions.stream().map(QuestionsDTO::toQuestions).collect(Collectors.toList());
        Tests tests = new Tests(this.nameTest, this.difficultyLevel, questions);

        return tests;
    }
}