package com.example.refactoring.first_step.split_variable;

import lombok.Getter;

@Getter
public class BeforeSplitVariable {

    private double perimeter;

    private double area;

    public BeforeSplitVariable() {
        this(0, 0);
    }

    public BeforeSplitVariable(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    /**
     * Update geometry
     * <br/><br/>
     * 1. Introduce Variable for calculation code<br/>
     * 2. Inline Variable for temp variable
     *
     * @param width width
     * @param height height
     */
    public void updateGeometry(double width, double height) {
        double temp = 2 * (width + height);
        perimeter = temp;

        temp = width * height;
        area = temp;
    }
}
