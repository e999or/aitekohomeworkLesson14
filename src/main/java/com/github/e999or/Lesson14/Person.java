package com.github.e999or.Lesson14;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<String> doList;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getDolist() {
        return doList;
    }


    public Person(String name, int age, List<String> dolist) {
        this.name = name;
        this.age = age;
        this.doList = dolist;
    }
}
