package com.example.refactoring.inheritance.pull_up_method;

public class BeforePullUpMethod {


    class Car {

    }

    class Taxi extends Car {
        private String name;

        public void drive() {
            // drive like taxi
        }
    }


}
