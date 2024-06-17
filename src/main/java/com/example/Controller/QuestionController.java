package com.example.Controller;

import com.example.Model.Question;
import com.example.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/craete")
    public Question createQuestion(@RequestBody Question question){
        Question question1 = questionService.createQuestion(question);
        return question1;
    }

    @GetMapping("/get")
    public List<Question> getAllQuestions(){
        List<Question> allQuestions = questionService.getAllQuestions();
        return allQuestions;
    }


    @GetMapping("/get/category")
    public List<Question> basedOnCAtegory(@RequestParam("category") String category){
        List<Question> questions = questionService.basedOnCAtegory(category);
        return questions;
    }
}
