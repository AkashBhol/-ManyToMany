package com.example.Service;

import com.example.Model.Question;

import java.util.List;

public interface QuestionService {

    public Question createQuestion(Question question);

    public List<Question> getAllQuestions();

    public List<Question> basedOnCAtegory(String category);

}
