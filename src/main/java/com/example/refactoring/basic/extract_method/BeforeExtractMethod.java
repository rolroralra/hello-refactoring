package com.example.refactoring.basic.extract_method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeforeExtractMethod {

    public static final double CONSTANT_OUTSTANDING = 10.0;

    public void printOwing(Invoice invoice) {
        printBanner();
        double outstanding = calculateOutstanding(invoice);

        // log details
        log.info("name: {}", invoice.customer());
        log.info("address: {}", invoice.address());
        log.info("email: {}", invoice.email());

        // log outstanding
        log.info("amount: {}", outstanding);
    }

    private double calculateOutstanding(Invoice invoice) {
        return CONSTANT_OUTSTANDING;
    }

    private void printBanner() {
        // Do Nothing
    }

    public record Invoice(
        String customer,
        String address,
        String email
    ) {

    }
}
