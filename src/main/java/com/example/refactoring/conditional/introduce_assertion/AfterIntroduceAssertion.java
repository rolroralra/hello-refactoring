package com.example.refactoring.conditional.introduce_assertion;


import com.google.common.base.Preconditions;

public class AfterIntroduceAssertion {
    public void someMethod(int value) {
        Preconditions.checkArgument(value >= 0,
            "value must be greater than 0");

        // Do something
    }


}
