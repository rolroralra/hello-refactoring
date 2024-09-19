package com.example.refactoring.combine_functions_into_class;

public class BeforeCombineFunctionsIntoClass {
    public void base(Reading reading) {
        // calculate base charge
        // ...
    }

    public void taxableCharge(Reading reading) {
        // calculate taxable charge
        // ...
    }

    public void calculateBaseCharge(Reading reading) {
        // calculate base charge
        // ...
    }

    public class Reading {

    }
}
