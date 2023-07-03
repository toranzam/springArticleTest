package com.example.springArticleTest.entity;

public class Article {

    private String title;

    private String content;

    public Article( String title, String content) {
        if(title == null || title.isBlank()) {
            throw new IllegalArgumentException(String.format("잘못된 게시글(%s) 제목입니다.", title));
        }

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
