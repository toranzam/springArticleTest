package com.example.springArticleTest.entity;

public class User {
    private String name;
    private Integer age;


    public User(String name, Integer age)  {
        if(name == null || name.isBlank()){

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
