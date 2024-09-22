package com.example.refactoring.conditional.decompose_conditional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import com.example.refactoring.conditional.decompose_conditional.BeforeDecomposeConditional.Plan;
import com.example.refactoring.conditional.decompose_conditional.BeforeDecomposeConditional.PlanManagement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BeforeDecomposeConditionalTest {
    private static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @ParameterizedTest(name = "inputDate: {1}, quantity: {2}, expected: {3}")
    @MethodSource("provideLocalDateAndQuantity")
    void test(Plan plan, LocalDate inputDate, long quantity, double expected) {
        PlanManagement planManagement = new PlanManagement(plan);

        double result = planManagement.calculateCharge(inputDate, quantity);

        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    static Stream<Arguments> provideLocalDateAndQuantity() {
        Plan plan = new Plan(
            LocalDate.parse("2024-06-01", DATETIME_FORMATTER),
            LocalDate.parse("2024-08-31", DATETIME_FORMATTER),
            1.0,
            500.0,
            0.75
        );

        return Stream.of(
            Arguments.of(plan, LocalDate.parse("2024-05-30", DATETIME_FORMATTER),
                100, 600.0),
            Arguments.of(plan, LocalDate.parse("2024-06-01", DATETIME_FORMATTER),
                100, 75.0),
            Arguments.of(plan, LocalDate.parse("2024-07-01", DATETIME_FORMATTER),
                100, 75.0),
            Arguments.of(plan, LocalDate.parse("2024-08-31", DATETIME_FORMATTER),
                100, 75.0),
            Arguments.of(plan, LocalDate.parse("2024-09-01", DATETIME_FORMATTER),
                100, 600.0)
        );
    }
}