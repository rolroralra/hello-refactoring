package com.example.refactoring.inheritance.pull_up_constructor_body;

/**
 * Pull Up/Down Constructor Body
 * <br/><br/>
 * Just try by creating super class constructor. <br/>
 * Then remove compile error.
 */
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
