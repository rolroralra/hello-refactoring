package com.example.refactoring.split_variable;

import lombok.Getter;

@Getter
public class AfterSplitVariable {

    private double perimeter;

    private double area;

    public AfterSplitVariable() {
        this(0, 0);
    }

    public AfterSplitVariable(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public void updateGeometry(double width, double height) {
        double perimeter = 2 * (width + height);
        this.perimeter = perimeter;

        double area = width * height;
        this.area = area;
    }
}
