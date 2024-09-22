package com.example.refactoring.conditional.decompose_conditional;

import java.time.LocalDate;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class AfterDecomposeConditional {

    @RequiredArgsConstructor
    static class PlanManagement {
        private final LocalDate summerStart;
        private final LocalDate summerEnd;
        private final double regularRate;
        private final double regularServiceCharge;
        private final double summerRate;

        public double calculateCharge(LocalDate date, long quantity) {
            if (isInSummer(date)) {
                return summerCharge(quantity);
            }

            return regularCharge(quantity);
        }

        private double regularCharge(long quantity) {
            return quantity * regularRate + regularServiceCharge;
        }

        private double summerCharge(long quantity) {
            return quantity * summerRate;
        }

        private boolean isInSummer(LocalDate date) {
            return !date.isBefore(summerStart) && !date.isAfter(summerEnd);
        }
    }
}
