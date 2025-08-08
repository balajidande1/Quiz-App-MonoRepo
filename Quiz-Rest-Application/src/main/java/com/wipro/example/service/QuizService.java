package com.wipro.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.example.entity.Question.Category;
import com.wipro.example.entity.Question.DifficultyLevel;
import com.wipro.example.entity.QuestionWrapper;
import com.wipro.example.entity.Quiz;

@Service
public interface QuizService {



	List<QuestionWrapper> getQuizQuestions(Long id);




	Quiz createQuiz(String difficultyLevel, String category, String title);

}
