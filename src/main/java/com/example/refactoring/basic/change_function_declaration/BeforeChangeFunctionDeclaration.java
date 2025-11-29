package com.example.refactoring.basic.change_function_declaration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeforeChangeFunctionDeclaration {

    public void process() {
        double r = 10;
        double area = circumference(r);

        log.info("Area: {}", area);

        // ...

    }

    public double circumference(double r) {
        return 2 * Math.PI * r;
    }
}
