package com.example.refactoring.basic.rename;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeforeRename {

    public void calculateArea(int height, int width) {
        int a = height * width;
        log.info("Area: {}", a);

        // ...

        double c = circum(2f * (height + width));
        log.info("Circumference: {}", c);
    }

    public double circum(float r) {
        return 2 * Math.PI * r;
    }

}
