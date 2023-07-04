package com.example.springArticleTest.dto.article;

import com.example.springArticleTest.entity.Article;
import com.example.springArticleTest.entity.ArticleEntity;

public class ArticleRequest {

    private String title;

    private String content;

    public ArticleRequest( String title, String content) {

        this.title = title;
        this.content = content;
    }


    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public ArticleEntity toEntity(ArticleRequest request) {
        return new ArticleEntity(null ,request.getTitle(), request.content);
    }
}
