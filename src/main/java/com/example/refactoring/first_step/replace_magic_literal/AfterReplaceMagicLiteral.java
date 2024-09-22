package com.example.refactoring.first_step.replace_magic_literal;

public class AfterReplaceMagicLiteral {

    public static final double GRAVITY_ACCELERATION = 9.81;

    public double potentialEnergy(double mass, double height) {
        return mass * GRAVITY_ACCELERATION * height;
    }
}
