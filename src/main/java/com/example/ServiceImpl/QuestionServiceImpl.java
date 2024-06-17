package com.example.ServiceImpl;

import com.example.Model.Question;
import com.example.Repo.QuestionRepo;
import com.example.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepo questionRepo;


    @Override
    public Question createQuestion(Question question) {
        Question save = questionRepo.save(question);
        return save;
    }

    @Override
    public List<Question> getAllQuestions() {
        List<Question> all = questionRepo.findAll();
        return all;
    }

    @Override
    public List<Question> basedOnCAtegory(String category) {
        List<Question> byCategory = questionRepo.findByCategory(category);
        return byCategory;
    }
}
