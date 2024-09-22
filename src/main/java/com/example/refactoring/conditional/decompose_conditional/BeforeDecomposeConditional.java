package com.example.refactoring.conditional.decompose_conditional;

import java.time.LocalDate;
import java.util.List;
import lombok.RequiredArgsConstructor;

public class BeforeDecomposeConditional {

    @RequiredArgsConstructor
    static class PlanManagement {
        private final Plan plan;

        public double calculateCharge(LocalDate inputDate, long quantity) {
            if (!inputDate.isBefore(plan.summerStart) && !inputDate.isAfter(plan.summerEnd)) {
                return quantity * plan.summerRate;
            } else {
                return quantity * plan.regularRate + plan.regularServiceCharge;
            }
        }
    }

    public record Plan(
        LocalDate summerStart,
        LocalDate summerEnd,
        double regularRate,
        double regularServiceCharge,
        double summerRate
    ) {

    }
}
