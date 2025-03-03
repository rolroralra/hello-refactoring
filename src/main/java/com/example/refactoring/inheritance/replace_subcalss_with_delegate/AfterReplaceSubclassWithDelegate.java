package com.example.refactoring.inheritance.replace_subcalss_with_delegate;

public class AfterReplaceSubclassWithDelegate {

    interface DrivingAlgorithm {
        String drive();
    }

    interface RepairAlgorithm {
        void repair();
    }

    abstract class Car {
        protected final DrivingAlgorithm drivingAlgorithm;
        protected final RepairAlgorithm repairAlgorithm;

        protected Car(DrivingAlgorithm drivingAlgorithm, RepairAlgorithm repairAlgorithm) {
            this.drivingAlgorithm = drivingAlgorithm;
            this.repairAlgorithm = repairAlgorithm;
        }

        public final String drive() {
            return drivingAlgorithm.drive();
        }

        public void repair() {
            repairAlgorithm.repair();
        }
    }

    class Bus extends Car {

        protected Bus(DrivingAlgorithm drivingAlgorithm, RepairAlgorithm repairAlgorithm) {
            super(drivingAlgorithm, repairAlgorithm);
        }
    }

    class Taxi extends Car {

        protected Taxi(DrivingAlgorithm drivingAlgorithm, RepairAlgorithm repairAlgorithm) {
            super(drivingAlgorithm, repairAlgorithm);
        }
    }
}
