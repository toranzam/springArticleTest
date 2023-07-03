package com.example.springArticleTest.entity;

public class User {
    private String name;
    private Integer age;


    public User(String name, Integer age) {
        if(name == null || name.isBlank()){
            throw new IllegalAccessException(String.format("잘못된 이름(%s)이 들어왔습니다.", name))
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
