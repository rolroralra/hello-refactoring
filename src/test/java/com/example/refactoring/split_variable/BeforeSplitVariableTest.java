package com.example.refactoring.split_variable;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BeforeSplitVariableTest {

    @DisplayName("Test updateGeometry method")
    @ParameterizedTest(name = "width={0}, height={1} -> perimeter={2}, area={3}")
    @MethodSource("provideTestInputArguments")
    void updateGeometry(double width, double height, double expectedPerimeter, double expectedArea) {
        BeforeSplitVariable beforeSplitVariable = new BeforeSplitVariable();

        beforeSplitVariable.updateGeometry(width, height);

        assertThat(beforeSplitVariable)
            .hasFieldOrPropertyWithValue("perimeter", expectedPerimeter)
            .hasFieldOrPropertyWithValue("area", expectedArea);
    }

    public static Stream<Arguments> provideTestInputArguments() {
        return Stream.of(
            Arguments.of(5f, 4f, 18f, 20f),
            Arguments.of(10f, 5f, 30f, 50f),
            Arguments.of(15f, 6f, 42f, 90f)
        );
    }
}