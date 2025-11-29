package com.example.refactoring.basic.inline_method;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.refactoring.basic.inline_method.AfterInlineMethod.Driver;
import org.junit.jupiter.api.Test;

class AfterInlineMethodTest {

    @Test
    void getRating() {
        Driver driver = new Driver();
        int rating = new AfterInlineMethod().getRating(driver);
        assertEquals(2, rating);
    }
}