package com.example.refactoring.basic.replace_temp_with_query;

/**
 * Replace Temp with Query
 * <br/><br/>
 * 1. Extract Method for the expression.
 * 2. Inline Variable for temp variable.
 */
public class BeforeReplaceTempWithQuery {

    class Order {

        private int quantity;
        private double itemPrice;

        public Order(int quantity, double itemPrice) {
            this.quantity = quantity;
            this.itemPrice = itemPrice;
        }

        public double calculateFinalPrice() {
            double basePrice = this.quantity * this.itemPrice;

            if (basePrice > 1000) {
                return basePrice * 0.95;
            } else {
                return basePrice * 0.98;
            }
        }
    }


}
