package ru.mireaproject.kb9.dao.repository.Test;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.mireaproject.kb9.entity.Test.DifficultyLevel;
import ru.mireaproject.kb9.entity.Test.Tests;


@Repository
public interface TestsRepository extends JpaRepository<Tests, Long>{
    public Tests findTestsByNameTestAndDifficultyLevel(String nameTest, DifficultyLevel difficultyLevel);
}
    

