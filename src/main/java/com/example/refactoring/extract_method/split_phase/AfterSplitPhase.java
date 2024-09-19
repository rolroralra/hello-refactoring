package com.example.refactoring.extract_method.split_phase;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AfterSplitPhase {

    private final List<Integer> priceList = List.of(100, 200, 300, 400, 500);

    public void orderProcess(String orderString) {
        Order order = Order.fromString(orderString);

        int productPrice = priceList.get(order.productId());
        int orderPrice = order.calculateOrderPrice(productPrice);

        // ...
        log.info("Product Price: {}", productPrice);
        log.info("Order Price: {}", orderPrice);
    }

    record Order(
        int productId,
        int quantity
    ) {
        public static final String REGEX = "\s+";
        public static final String DELIMITER = "-";

        public int calculateOrderPrice(int productPrice) {
            return quantity * productPrice;
        }

        public static Order fromString(String orderString) {
            String[] orderData = orderString.split(REGEX);

            int productId = Integer.parseInt(orderData[0].split(DELIMITER)[1]);
            int quantity = Integer.parseInt(orderData[1]);

            return new Order(
                productId,
                quantity
            );
        }
    }
}
