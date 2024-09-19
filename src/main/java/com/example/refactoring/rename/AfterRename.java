package com.example.refactoring.rename;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AfterRename {

    public void calculateArea(int height, int width) {
        int area = height * width;
        log.info("Area: {}", area);

        // ...
    }

    public double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

}
