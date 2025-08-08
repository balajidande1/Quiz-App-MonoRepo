package com.wipro.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.example.entity.Question;
import com.wipro.example.entity.Question.Category;
import com.wipro.example.entity.Question.DifficultyLevel;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {


	List<Question> findRandomQuestionsByCategoryAndDifficultyLevel(String difficultyLevel, String category);

	

}
