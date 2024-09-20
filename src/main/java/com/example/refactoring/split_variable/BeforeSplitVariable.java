package com.example.refactoring.split_variable;

import lombok.Getter;

@Getter
public class BeforeSplitVariable {

    private double perimeter;

    private double area;

    public BeforeSplitVariable(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public void updateGeometry(double width, double height) {
        double temp = 2 * (width + height);
        perimeter = temp;
        
        temp = width * height;
        area = temp;
    }
}
