package ru.mireaproject.kb9.controller.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.mireaproject.kb9.dto.Test.TestsDTO;
import ru.mireaproject.kb9.entity.Test.DifficultyLevel;
import ru.mireaproject.kb9.service.Test.TestServiceInterface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;



@RestController
@RequestMapping("/api/tests")
public class TestsController {
    
    @Autowired
    private TestServiceInterface testService;

    @PostMapping("/add")
    public Long postAddTests(@RequestBody TestsDTO testsDTO) {
        return testService.addTest(testsDTO.toTests());
    }


    @GetMapping
    public List<TestsDTO> tests() {
        return this.testService.getTest().stream()
        .map(TestsDTO::from)
        .collect(Collectors.toList());
    }


    @GetMapping("/find")
    public ResponseEntity<TestsDTO> getTestByName(@RequestParam String nameTest, DifficultyLevel difficultyLevel) {
        
        TestsDTO result = TestsDTO.from(testService.getTestByName(nameTest, difficultyLevel));
        return ResponseEntity.ok(result);
    }

    @GetMapping("/clear")
    public void testClear() {
        this.testService.clearTests();
    }
    


}
