package com.example.refactoring.first_step.replace_magic_literal;

/**
 * 마법 숫자 리터럴을 상수로 치환
 * <br/><br/>
 * Introduce Constant
 */
public class BeforeReplaceMagicLiteral {

    public double potentialEnergy(double mass, double height) {
        return mass * 9.81 * height;
    }
}
