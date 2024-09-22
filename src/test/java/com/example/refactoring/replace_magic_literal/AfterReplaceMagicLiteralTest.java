package com.example.refactoring.replace_magic_literal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class AfterReplaceMagicLiteralTest {

    @ParameterizedTest
    @MethodSource("com.example.refactoring.replace_magic_literal.BeforeReplaceMagicLiteralTest#providePotentialEnergyArguments")
    void potentialEnergy(double mass, double height, double expected) {
        AfterReplaceMagicLiteral afterReplaceMagicLiteral = new AfterReplaceMagicLiteral();

        double result = afterReplaceMagicLiteral.potentialEnergy(mass, height);

        assertThat(result).isCloseTo(expected, offset(0.01));
    }
}