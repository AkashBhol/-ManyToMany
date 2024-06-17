package com.example.Service;

import com.example.Model.Quiz;

import java.util.List;

public interface QuizService {

    public Quiz createQuiz(Quiz  quiz);

    public List<Quiz> getAllQuiz();
}
