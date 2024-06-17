package com.example.ServiceImpl;

import com.example.Model.Question;
import com.example.Model.Quiz;
import com.example.Repo.QuestionRepo;
import com.example.Repo.QuizRepo;
import com.example.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class QuizServiceImpl  implements QuizService {

    @Autowired
    private QuestionRepo questionRepo;

    @Autowired
    private QuizRepo quizRepo;


    public Quiz createQuiz(@RequestBody Quiz quiz){
        List<Question> byCategory = questionRepo.findByCategory(quiz.getCategory());
        quiz.setQuestions(byCategory);
        Quiz save = quizRepo.save(quiz);
        return save;
    }

    @Override
    public List<Quiz> getAllQuiz() {
        List<Quiz> all = quizRepo.findAll();
        return all;
    }
}
