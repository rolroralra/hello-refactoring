package com.example.refactoring.inline_variable;

public class BeforeInlineVariable {
    public static final double MIN_PRICE = 1000;
    private Order baseOrder = new Order();

    public boolean isMoreThanMinPrice() {
        double basePrice = baseOrder.price;

        return basePrice > MIN_PRICE;
    }

    public class Order {
        private double price = 1000;
    }

}
