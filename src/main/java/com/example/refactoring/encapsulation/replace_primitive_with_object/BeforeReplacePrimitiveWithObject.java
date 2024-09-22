package com.example.refactoring.encapsulation.replace_primitive_with_object;

import java.util.List;

/**
 * Replace Primitive with Object
 * <br/><br/>
 * 1. Extract Method for filter method<br/>
 * 2. Convert into instance method for extracted method<br/>
 */
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
