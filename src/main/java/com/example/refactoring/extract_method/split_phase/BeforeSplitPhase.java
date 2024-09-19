package com.example.refactoring.extract_method.split_phase;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeforeSplitPhase {

    private final List<Integer> priceList = List.of(100, 200, 300, 400, 500);

    public void orderProcess(String orderString) {
        String[] orderData = orderString.split("\s+");
        int productPrice = priceList.get(Integer.parseInt(orderData[0].split("-")[1]));
        int orderPrice = Integer.parseInt(orderData[1]) * productPrice;

        // ...
        log.info("Product Price: {}", productPrice);
        log.info("Order Price: {}", orderPrice);
    }

}
