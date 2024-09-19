package com.example.refactoring.combine_functions_into_class;

public class AfterCombineFunctionsIntoClass {

    public class Reading {
        public void base() {
            // calculate base charge
            // ...
        }

        public void taxableCharge() {
            // calculate taxable charge
            // ...
        }

        public void calculateBaseCharge() {
            // calculate base charge
            // ...
        }
    }
}
