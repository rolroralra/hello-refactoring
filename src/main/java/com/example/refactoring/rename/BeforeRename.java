package com.example.refactoring.rename;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeforeRename {

    public void calculateArea(int height, int width) {
        int a = height * width;
        log.info("Area: {}", a);

        // ...
    }

    public double circum(float r) {
        return 2 * Math.PI * r;
    }

}
