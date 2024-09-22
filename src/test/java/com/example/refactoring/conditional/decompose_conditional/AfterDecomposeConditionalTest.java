package com.example.refactoring.conditional.decompose_conditional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import com.example.refactoring.conditional.decompose_conditional.AfterDecomposeConditional.PlanManagement;
import com.example.refactoring.conditional.decompose_conditional.BeforeDecomposeConditional.Plan;
import java.time.LocalDate;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class AfterDecomposeConditionalTest {
    @ParameterizedTest(name = "inputDate: {1}, quantity: {2}, expected: {3}")
    @MethodSource("com.example.refactoring.conditional.decompose_conditional.BeforeDecomposeConditionalTest#provideLocalDateAndQuantity")
    void test(Plan plan, LocalDate inputDate, long quantity, double expected) {
        PlanManagement planManagement = new PlanManagement(plan);

        double result = planManagement.calculateCharge(inputDate, quantity);

        assertThat(result).isCloseTo(expected, offset(0.001));
    }

}