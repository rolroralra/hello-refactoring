package com.example.refactoring.inline_method;

public class BeforeInlineMethod {

    public int getRating(Driver driver) {
        return moreThanFiveLateDeliveries(driver) ? 2 : 1;
    }

    public boolean moreThanFiveLateDeliveries(Driver driver) {
        return driver.numberOfLateDeliveries() > 5;
    }

    public static class Driver {

        public int numberOfLateDeliveries() {
            return 8;
        }
    }
}
