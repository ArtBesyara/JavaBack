package ru.mireaproject.kb9.dao.Test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import jakarta.transaction.Transactional;
import ru.mireaproject.kb9.dao.repository.Test.TestsRepository;
import ru.mireaproject.kb9.entity.Test.DifficultyLevel;
import ru.mireaproject.kb9.entity.Test.Tests;


@Repository
public class TestsDAO implements TestsDAOInterface{


    @Autowired
    private TestsRepository testsRepository;


    @Override
    public Long addTest(Tests test) {

        testsRepository.save(test);
        return test.getId();
    }

    @Override
    @Transactional
    public Tests findTests(String nameTest, DifficultyLevel difficultyLevel) {
        return testsRepository.findTestsByNameTestAndDifficultyLevel(nameTest, difficultyLevel);
    }

    @Override
    public void clearTests() {
        testsRepository.deleteAll();
    }

    @Override
    public List<Tests> getTests() {
       return this.testsRepository.findAll();
    }
    
}
