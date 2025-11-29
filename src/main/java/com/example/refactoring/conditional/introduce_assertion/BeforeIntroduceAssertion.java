package com.example.refactoring.conditional.introduce_assertion;

public class BeforeIntroduceAssertion {
    public void someMethod(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("value must be greater than 0");
        }

        // Do something
    }
}
