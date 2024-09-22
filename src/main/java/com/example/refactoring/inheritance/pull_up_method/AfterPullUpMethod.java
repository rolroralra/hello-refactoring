package com.example.refactoring.inheritance.pull_up_method;

public class AfterPullUpMethod {


    class Car {

        private String name;

        public void drive() {
            // drive like taxi
        }
    }

    class Taxi extends Car {

    }

}
