package com.example.Controller;

import com.example.Model.Quiz;
import com.example.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/create/quiz")
    public Quiz createQuiz(@RequestBody Quiz quiz){
        Quiz quiz1 = quizService.createQuiz(quiz);
        return quiz1;
    }

    @GetMapping("/get/Quiz")
    public List<Quiz> getAllQuiz(){
        List<Quiz> allQuiz = quizService.getAllQuiz();
        return allQuiz;
    }
}
