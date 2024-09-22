package com.example.refactoring.split_variable;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class AfterSplitVariableTest {

    @DisplayName("Test updateGeometry method")
    @ParameterizedTest(name = "width={0}, height={1} -> perimeter={2}, area={3}")
    @MethodSource("com.example.refactoring.split_variable.BeforeSplitVariableTest#provideTestInputArguments")
    void updateGeometry(double width, double height, double expectedPerimeter, double expectedArea) {
        AfterSplitVariable afterSplitVariable = new AfterSplitVariable();

        afterSplitVariable.updateGeometry(width, height);

        assertThat(afterSplitVariable)
            .hasFieldOrPropertyWithValue("perimeter", expectedPerimeter)
            .hasFieldOrPropertyWithValue("area", expectedArea);
    }
}