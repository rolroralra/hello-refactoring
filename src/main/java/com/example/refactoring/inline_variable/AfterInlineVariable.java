package com.example.refactoring.inline_variable;

public class AfterInlineVariable {
    public static final double MIN_PRICE = 1000;
    private Order baseOrder = new Order();

    public boolean isMoreThanMinPrice() {
        return baseOrder.price > MIN_PRICE;
    }

    public class Order {
        private double price = 1000;
    }

}
