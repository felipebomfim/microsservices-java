package com.telusko.quizapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.telusko.quizapp.service.QuestionService;

@SpringBootApplication
public class QuizappApplication {

	@Autowired
	QuestionService questionService;
	public static void main(String[] args) {
		SpringApplication.run(QuizappApplication.class, args);
	}

}
