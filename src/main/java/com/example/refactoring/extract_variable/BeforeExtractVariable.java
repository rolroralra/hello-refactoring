package com.example.refactoring.extract_variable;

public class BeforeExtractVariable {

    public class Order {
        private int quantity;
        private int itemPrice;
        private int minQuantityForDiscount = 500;
        private double discountRate = 0.05;
        private int minShippingCost = 100;
        private double shippingCostRate = 0.1;

        public double calculatePrice() {
            // price is base price - discount + shipping cost
            return quantity * itemPrice -
                Math.max(0, quantity - minQuantityForDiscount) * itemPrice * discountRate +
                Math.max(minShippingCost, quantity * itemPrice * shippingCostRate);
        }
    }

}
