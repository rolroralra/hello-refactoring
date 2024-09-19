package com.example.refactoring.replace_primitive_with_object;

import java.util.List;

public class BeforeReplacePrimitiveWithObject {
    class Order {
        private String priority;
    }

    class OrderPriority {

    }

    List<Order> test() {
        List<Order> orders = List.of(new Order(), new Order());

        return orders.stream()
            .filter(o -> o.priority.equals("high") || o.priority.equals("rush"))
            .toList();
    }
}
