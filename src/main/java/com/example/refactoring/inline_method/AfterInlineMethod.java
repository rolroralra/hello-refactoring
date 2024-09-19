package com.example.refactoring.inline_method;

public class AfterInlineMethod {

    public int getRating(Driver driver) {
        return driver.numberOfLateDeliveries() > 5 ? 2 : 1;
    }

    public static class Driver {

        public int numberOfLateDeliveries() {
            return 8;
        }
    }
}
