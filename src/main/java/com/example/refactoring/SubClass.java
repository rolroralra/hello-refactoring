package com.example.refactoring;

public class SubClass extends MainClass {
    private final static String MAGIC_CONSTANT = "magic";
    private final static Integer MAGIC_NUMBER = 42;

    private final String a;
    private final Object b;

    public SubClass(String a, Object b, String a1, Object b1) {
        super(a, b);
        this.a = a1;
        this.b = b1;
    }
}
