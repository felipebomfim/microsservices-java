package com.telusko.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.quizapp.Question;
import java.util.List;


public interface QuestionRepository extends JpaRepository<Question,Integer> {
    List<Question> findByCategory(String category);
}
