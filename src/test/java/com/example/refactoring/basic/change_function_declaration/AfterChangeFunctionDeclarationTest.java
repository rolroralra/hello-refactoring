package com.example.refactoring.basic.change_function_declaration;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.data.Offset;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class AfterChangeFunctionDeclarationTest {
    private final AfterChangeFunctionDeclaration afterChangeFunctionDeclaration = new AfterChangeFunctionDeclaration();

    @ParameterizedTest
    @MethodSource("com.example.refactoring.basic.change_function_declaration.BeforeChangeFunctionDeclarationTest#provideArguments")
    void circum(double givenRadius, double expectedResult, Offset<Double> offset) {
       assertThat(afterChangeFunctionDeclaration.circumference(givenRadius))
           .isCloseTo(expectedResult, offset);
    }
}