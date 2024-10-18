package ru.mireaproject.kb9.service;

import java.util.List;

import ru.mireaproject.kb9.entity.DifficultyLevel;
import ru.mireaproject.kb9.entity.Tests;


public interface TestServiceInterface {
    List<Tests> getTest();
    Long addTest(Tests tests);
    Tests getTestByName(String nameTest, DifficultyLevel difficultyLevel);
    void clearTests();
}
