package com.wipro.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.example.entity.Question;
import com.wipro.example.entity.Question.DifficultyLevel;
import com.wipro.example.entity.QuestionWrapper;
import com.wipro.example.entity.Quiz;
import com.wipro.example.service.QuizService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@RestController
public class QuizController {
	
	private final QuizService quizService;
	
	@PostMapping("/create")
    public Quiz createQuiz(
            @RequestParam String difficultyLevel,
            @RequestParam String category,               
            @RequestParam String title) {
        return quizService.createQuiz(difficultyLevel, category, title);
    }
    
    
    
    @GetMapping("/getQuizByID/{id}")                  
    public List<QuestionWrapper> getQuizQuestions(@PathVariable("id") Long id){
        return quizService.getQuizQuestions(id);
    }
    
    
    
   
}
