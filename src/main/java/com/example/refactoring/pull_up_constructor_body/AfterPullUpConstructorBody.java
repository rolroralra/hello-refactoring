package com.example.refactoring.pull_up_constructor_body;

public class AfterPullUpConstructorBody {

    class Car {
        protected String name;

        protected Car(String name) {
        }
    }

    class Taxi extends Car {

        public Taxi(String name) {
            super(name);
        }
    }
}
