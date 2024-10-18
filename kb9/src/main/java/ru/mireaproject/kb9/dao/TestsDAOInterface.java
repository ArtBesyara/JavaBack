package ru.mireaproject.kb9.dao;

import java.util.List;

import ru.mireaproject.kb9.entity.DifficultyLevel;
import ru.mireaproject.kb9.entity.Tests;

public interface TestsDAOInterface {
    List<Tests> getTests();
    Long addTest(Tests test);
    Tests findTests(String nameTest, DifficultyLevel difficultyLevel);
    void clearTests();
}
