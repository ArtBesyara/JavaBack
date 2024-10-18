package ru.mireaproject.kb9.dao.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.mireaproject.kb9.entity.DifficultyLevel;
import ru.mireaproject.kb9.entity.Tests;


@Repository
public interface TestsRepository extends JpaRepository<Tests, Long>{
    public Tests findTestsByNameTestAndDifficultyLevel(String nameTest, DifficultyLevel difficultyLevel);
}
    

