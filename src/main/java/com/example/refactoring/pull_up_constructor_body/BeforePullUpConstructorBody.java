package com.example.refactoring.pull_up_constructor_body;

public class BeforePullUpConstructorBody {

    class Car {
        protected String name;
    }

    class Taxi extends Car {

        public Taxi(String name) {
            super();
            this.name = name;
        }
    }
}
