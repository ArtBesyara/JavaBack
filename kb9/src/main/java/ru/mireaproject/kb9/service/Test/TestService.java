package ru.mireaproject.kb9.service.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;
import ru.mireaproject.kb9.dao.Test.TestsDAOInterface;
import ru.mireaproject.kb9.entity.Test.DifficultyLevel;
import ru.mireaproject.kb9.entity.Test.Tests;

import java.util.List;


@Log4j2
@Service
public class TestService implements TestServiceInterface{

   @Autowired
    TestsDAOInterface testsDAO;

    @Override
    @Transactional
    public Long addTest(Tests test){
        log.info("add test: " + test.toString());
        return testsDAO.addTest(test);
    }

    @Override
    public List<Tests> getTest(){
        log.info("get all tests");
        return this.testsDAO.getTests();
    }


    @Override
    public Tests getTestByName(String nameTest, DifficultyLevel difficultyLevel){
        
        log.info("get test by name: " + nameTest + " by level: " + difficultyLevel);
        
        return testsDAO.findTests(nameTest, difficultyLevel);
        
        
    }


    @Override
    public void clearTests(){
        log.info("delete all");
        this.testsDAO.clearTests();
    }

}
