package com.example.refactoring.inline_variable.replace_temp_with_query;

public class AfterReplaceTempWithQuery {

    class Order {

        private int quantity;
        private double itemPrice;

        public Order(int quantity, double itemPrice) {
            this.quantity = quantity;
            this.itemPrice = itemPrice;
        }

        public double calculateFinalPrice() {
            if (basePrice() > 1000) {
                return basePrice() * 0.95;
            } else {
                return basePrice() * 0.98;
            }
        }

        private double basePrice() {
            return this.quantity * this.itemPrice;
        }
    }
}
