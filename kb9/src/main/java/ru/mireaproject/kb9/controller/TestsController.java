package ru.mireaproject.kb9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import ru.mireaproject.kb9.service.TestServiceI;
import ru.mireaproject.kb9.dto.TestsDTO;
import ru.mireaproject.kb9.model.Tests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;



@RestController
@RequestMapping("/api/tests")
public class TestsController {
    
    @Autowired
    private TestServiceI testService;

    @PostMapping("/add")
    public ResponseEntity<Tests> postAddTests(@RequestBody Tests entity) {
        System.out.println(entity); 
        testService.addTest(entity);
        return ResponseEntity.ok().build();
    }


    @GetMapping
    public List<TestsDTO> tests() {
    return this.testService.getTest().stream()
        .map(TestsDTO::from) // Преобразуем каждый Tests в TestsDTO
        .collect(Collectors.toList()); // Собираем обратно в список
    }

    @GetMapping("/find")
    public ResponseEntity<Tests> getTestByName(@RequestParam String nameTest) {
        return ResponseEntity.ok(testService.getTestByName(nameTest));
    }
    
    @GetMapping("/clear")
    public ResponseEntity<Tests> clearTests() {
        testService.clearTests();
        return ResponseEntity.ok().build();
    }
    

}
