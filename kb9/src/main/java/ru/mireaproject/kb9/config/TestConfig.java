package ru.mireaproject.kb9.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ru.mireaproject.kb9.entity.Tests;

import java.util.List;
import java.util.ArrayList;

@Configuration
public class TestConfig {
    private List<Tests> tests;


    public TestConfig(){
        this.tests = new ArrayList<>();
    }

    @Bean
    public List<Tests> getTest(){
        return this.tests;
    }

    // @Bean
    // public String getNameTest(int index){
    //     return this.tests.get(index).getNameTest();
    // }
}
