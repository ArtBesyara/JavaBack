package ru.mireaproject.kb9.service.Test;

import java.util.List;

import ru.mireaproject.kb9.entity.Test.DifficultyLevel;
import ru.mireaproject.kb9.entity.Test.Tests;


public interface TestServiceInterface {
    List<Tests> getTest();
    Long addTest(Tests tests);
    Tests getTestByName(String nameTest, DifficultyLevel difficultyLevel);
    void clearTests();
}
