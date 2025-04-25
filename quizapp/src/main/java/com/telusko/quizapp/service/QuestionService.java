package com.telusko.quizapp.service;

import java.util.List;
import com.telusko.quizapp.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import com.telusko.quizapp.Question;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionRepository.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionRepository.save(question);
        return "success";
    }
}
