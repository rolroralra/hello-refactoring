package com.example.refactoring;

import org.springframework.boot.SpringApplication;

public class MainClass {
    private final static String MAGIC_CONSTANT = "magic";
    private final static Integer MAGIC_NUMBER = 42;

    private final String a;
    private final Object b;

    public static void main(String[] args) {
        SpringApplication.run(HelloRefactoringApplication.class, args);
    }

    public MainClass(String a, Object b) {
        this.a = a;
        this.b = b;
    }

    public String test(String a, Integer b, Object c) {
        return "Hello Refactoring!";
    }
}
