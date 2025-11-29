package com.example.refactoring.basic.change_function_declaration;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.assertj.core.data.Offset;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BeforeChangeFunctionDeclarationTest {
    private final BeforeChangeFunctionDeclaration beforeChangeFunctionDeclaration = new BeforeChangeFunctionDeclaration();

    @ParameterizedTest
    @MethodSource("provideArguments")
    void circumference(double givenRadius, double expectedResult, Offset<Double> offset) {
       assertThat(beforeChangeFunctionDeclaration.circumference(givenRadius))
           .isCloseTo(expectedResult, offset);
    }

    static Stream<Arguments> provideArguments() {
        return Stream.of(1.0, 2.0, 2.6, 3.7)
            .map(r -> Arguments.of(r, Math.PI * r * 2, Offset.offset(0.001)));
    }
}