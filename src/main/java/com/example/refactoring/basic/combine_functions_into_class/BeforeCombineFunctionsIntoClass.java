package com.example.refactoring.basic.combine_functions_into_class;

/**
 * Combine Functions Into Class
 * <br/><br/>
 * Move Instance Method for methods
 */
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
