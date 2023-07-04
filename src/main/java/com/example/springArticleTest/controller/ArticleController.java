package com.example.springArticleTest.controller;


import com.example.springArticleTest.dto.article.ArticleRequest;
import com.example.springArticleTest.dto.article.ArticleResponse;
import com.example.springArticleTest.dto.Request;
import com.example.springArticleTest.entity.Article;
import com.example.springArticleTest.entity.ArticleEntity;
import com.example.springArticleTest.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleRepository articleRepository;

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


//    @PostMapping("/Article")
//    public void createArticle(@RequestBody ArticleRequest request) {
//        articles.add(new Article(request.getTitle(), request.getContent()));
//    }

    @PostMapping("/article")
    public void createArticle(@RequestBody ArticleRequest request) {
        ArticleEntity newArticle = request.toEntity(request);

        articleRepository.save(newArticle);

    }

//    @GetMapping("/article")
//    public List<ArticleResponse> showArticles(){
//        List<ArticleResponse> responses = new ArrayList<>();
//        for(int i = 0; i < articles.size(); i++){
//            responses.add(new ArticleResponse(i+1 , articles.get(i).getTitle(), articles.get(i).getContent()));
//        }
//        return responses;
//    }

    @GetMapping("/article")
    public List<ArticleResponse> showArticles() {

        List<ArticleResponse> responses = new ArrayList<>();

        List<ArticleEntity> articles = articleRepository.findAll();

        for(int i = 0; i < articles.size(); i++){
            responses.add(new ArticleResponse(i+1, articles.get(i).getTitle(), articles.get(i).getContent()));

        }

        return responses;


    }

}
