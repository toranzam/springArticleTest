package com.example.springArticleTest.controller;


import com.example.springArticleTest.dto.ArticleRequest;
import com.example.springArticleTest.dto.ArticleResponse;
import com.example.springArticleTest.dto.Request;
import com.example.springArticleTest.entity.Article;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArticleController {

    List<Article> articles = new ArrayList<>();

//    @GetMapping("/add")
//    public int plus(@RequestParam int number1, @RequestParam int number2) {
//        return number1 + number2;
//
//    }


    @GetMapping("/add")
    public int plus( Request request) {
        return request.getNumber1() + request.getNumber2();

    }

    @PostMapping("/multiply")
    public int multiply(@RequestBody Request request) {
        return request.getNumber1() * request.getNumber2();
    }


    @PostMapping("/Article")
    public void createArticle(@RequestBody ArticleRequest request) {
        articles.add(new Article(request.getTitle(), request.getContent()));
    }

    @GetMapping("/Article")
    public List<ArticleResponse> showArticles(){
        List<ArticleResponse> responses = new ArrayList<>();
        for(int i = 0; i < articles.size(); i++){
            responses.add(new ArticleResponse(i+1 , articles.get(i).getTitle(), articles.get(i).getContent()));
        }

        return responses;
    }

}
