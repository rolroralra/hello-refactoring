package com.example.refactoring.extract_variable;

public class AfterExtractVariable {

    public class Order {
        private int quantity;
        private double itemPrice;
        private int minQuantityForDiscount = 500;
        private double discountRate = 0.05;
        private int minShippingCost = 100;
        private double shippingCostRate = 0.1;

        public double calculatePrice() {
            // price is base price - discount + shipping cost
            double basePrice = quantity * itemPrice;
            double discount = Math.max(0, quantity - minQuantityForDiscount) * itemPrice * discountRate;
            double shippingCost = Math.max(minShippingCost, quantity * itemPrice * shippingCostRate);

            return basePrice - discount + shippingCost;
        }

    }

}
