package ru.mireaproject.kb9.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.mireaproject.kb9.config.TestConfig;
import ru.mireaproject.kb9.model.Tests;

import java.util.List;


@Service
public class TestService implements TestServiceI{
    @Autowired
    private TestConfig testConfig;

    @Override
    public void addTest(Tests test){
        this.testConfig.getTest().add(test);
    }

    @Override
    public List<Tests> getTest(){
        return this.testConfig.getTest();
    }


    @Override
    public Tests getTestByName(String nameTest){
        return this.testConfig.getTest().stream()
        .filter(x -> x.getNameTest().equals(nameTest))
        .findFirst()
        .orElse(null);
    }

    @Override
    public void clearTests(){
        this.testConfig.getTest().clear();
    }

}
