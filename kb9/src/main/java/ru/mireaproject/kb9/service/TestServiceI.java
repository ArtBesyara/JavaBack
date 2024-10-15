package ru.mireaproject.kb9.service;

import ru.mireaproject.kb9.model.Tests;
import java.util.List;

public interface TestServiceI {
    List<Tests> getTest();
    void addTest(Tests tests);
    Tests getTestByName(String nameTest);
    void clearTests();
}
