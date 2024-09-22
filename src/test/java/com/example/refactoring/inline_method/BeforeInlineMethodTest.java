package com.example.refactoring.inline_method;

import static org.junit.jupiter.api.Assertions.*;

import com.example.refactoring.basic.inline_method.BeforeInlineMethod;
import com.example.refactoring.basic.inline_method.BeforeInlineMethod.Driver;
import org.junit.jupiter.api.Test;

class BeforeInlineMethodTest {

    @Test
    void getRating() {
        Driver driver = new Driver();
        int rating = new BeforeInlineMethod().getRating(driver);
        assertEquals(2, rating);
    }
}