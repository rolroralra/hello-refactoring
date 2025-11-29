package com.example.refactoring.inheritance.replace_subcalss_with_delegate;

public class BeforeReplaceSubclassWithDelegate {

    abstract class Car {

        public abstract String drive();

        public void repair() {
            // Do something
        }
    }

    class Bus extends Car {
        @Override
        public String drive() {
            return "Bus is driving";
        }
    }

    class Taxi extends Car {
        @Override
        public String drive() {
            return "Taxi is driving";
        }
    }
}
