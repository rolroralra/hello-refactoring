package com.example.refactoring.conditional.decompose_conditional;

import java.time.LocalDate;
import java.util.List;
import lombok.RequiredArgsConstructor;

public class BeforeDecomposeConditional {

    @RequiredArgsConstructor
    static class PlanManagement {
        private final LocalDate summerStart;
        private final LocalDate summerEnd;
        private final double regularRate;
        private final double regularServiceCharge;
        private final double summerRate;

        public double calculateCharge(LocalDate date, long quantity) {
            if (date.isBefore(summerStart) && date.isAfter(summerEnd)) {
                return quantity * summerRate;
            }

            return quantity * regularRate + regularServiceCharge;
        }
    }

    record Plan(
        LocalDate summerStart,
        LocalDate summerEnd,
        double regularRate,
        double regularServiceCharge,
        double summerRate
    ) {}

    void test(Plan plan) {
        LocalDate date = LocalDate.now();
        long quantity = 0;

        double charge = 0;
        if (date.isBefore(plan.summerStart) && date.isAfter(plan.summerEnd)) {
            charge = quantity * plan.summerRate();
        } else {
            charge = quantity * plan.regularRate() + plan.regularServiceCharge();
        }

        List<Integer> list = List.of(1, 2, 3, 4, 5);

        List<Integer> list1 =

            list.stream()
                .sorted((a, b) -> b - a)
                .toList();


        list1.add(2);
    }

    class ContainerWithMergeSort {
        // ...
    }

//    abstract class Car2 {
//        abstract void drive();
//    }

    abstract class Car {
        private final DrivingAlgorithm drivingAlgorithm;

        protected Car(DrivingAlgorithm drivingAlgorithm) {
            this.drivingAlgorithm = drivingAlgorithm;
        }

        public void drive() {
            drivingAlgorithm.drive(this);
        }
    }

    class Bus extends Car {

        public Bus(DrivingAlgorithm drivingAlgorithm) {
            super(new BusDrivingAlgorithm());
        }

        @Override
        public void drive() {
            // drive like bus
        }
    }

    class Taxi extends Car {

        public Taxi(DrivingAlgorithm drivingAlgorithm) {
            super(new TaxiDrivingAlgorithm());
        }

        @Override
        public void drive() {
            // drive like taxi
        }
    }


    interface DrivingAlgorithm {
        void drive(Car car);
    }

    private static class TaxiDrivingAlgorithm implements DrivingAlgorithm {

        @Override
        public void drive(Car car) {

        }
    }

    private static class BusDrivingAlgorithm implements DrivingAlgorithm {

        @Override
        public void drive(Car car) {

        }
    }
}
