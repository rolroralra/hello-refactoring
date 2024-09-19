package com.example.refactoring.replace_primitive_with_object;

import java.util.List;

public class AfterReplacePrimitiveWithObject {
    class Order {
        private String priority;

        private boolean isHighAndRush() {
            return this.priority.equals("high") || this.priority.equals("rush");
        }
    }

    class OrderPriority {

    }

    List<Order> test() {
        List<Order> orders = List.of(new Order(), new Order());

        return orders.stream()
            .filter(Order::isHighAndRush)
            .toList();
    }

}
