package com.example.springArticleTest.dto;

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
}
