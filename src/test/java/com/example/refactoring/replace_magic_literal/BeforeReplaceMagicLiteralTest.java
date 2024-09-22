package com.example.refactoring.replace_magic_literal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import com.example.refactoring.first_step.replace_magic_literal.BeforeReplaceMagicLiteral;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BeforeReplaceMagicLiteralTest {

    @ParameterizedTest
    @MethodSource("providePotentialEnergyArguments")
    void potentialEnergy(double mass, double height, double expected) {
        BeforeReplaceMagicLiteral beforeReplaceMagicLiteral = new BeforeReplaceMagicLiteral();

        double result = beforeReplaceMagicLiteral.potentialEnergy(mass, height);

        assertThat(result).isCloseTo(expected, offset(0.01));
    }

    public static Stream<Arguments> providePotentialEnergyArguments() {
        return Stream.of(
            Arguments.of(10.0, 5.0, 490.5)
        );
    }
}