package ru.mireaproject.kb9.dao.Test;

import java.util.List;

import ru.mireaproject.kb9.entity.Test.DifficultyLevel;
import ru.mireaproject.kb9.entity.Test.Tests;

public interface TestsDAOInterface {
    List<Tests> getTests();
    Long addTest(Tests test);
    Tests findTests(String nameTest, DifficultyLevel difficultyLevel);
    void clearTests();
}
