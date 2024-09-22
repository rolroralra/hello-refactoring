package com.example.refactoring.conditional.decompose_conditional;

import com.example.refactoring.conditional.decompose_conditional.BeforeDecomposeConditional.Plan;
import java.time.LocalDate;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class AfterDecomposeConditional {

    @RequiredArgsConstructor
    static class PlanManagement {
        private final Plan plan;

        public double calculateCharge(LocalDate date, long quantity) {
            if (isInSummer(date)) {
                return summerCharge(quantity);
            }

            return regularCharge(quantity);
        }

        private double regularCharge(long quantity) {
            return quantity * plan.regularRate() + plan.regularServiceCharge();
        }

        private double summerCharge(long quantity) {
            return quantity * plan.summerRate();
        }

        private boolean isInSummer(LocalDate date) {
            return !date.isBefore(plan.summerStart()) && !date.isAfter(plan.summerEnd());
        }
    }
}
