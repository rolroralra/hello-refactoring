package com.example.refactoring.conditional.replace_conditional_with_polymorphism;

import java.util.Arrays;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class AfterReplaceConditionalWithPolymorphism {
    interface Flyable {
        default String fly() {
            return "unknown type";
        }
    }

    static class Bird implements Flyable {
        @Override
        public String fly() {
            return "bird is flying";
        }
    }

    static class Airplane implements Flyable {
        @Override
        public String fly() {
            return "airplane is flying";
        }
    }

    static class Superman implements Flyable {
        @Override
        public String fly() {
            return "superman is flying";
        }
    }

    public static String fly(String type) {
        return switch (BirdType.of(type)) {
            case BIRD -> new Bird().fly();
            case AIRPLANE -> new Airplane().fly();
            case SUPERMAN -> new Superman().fly();
            default -> new Flyable() {}.fly();
        };
    }

    private enum BirdType {
        BIRD,
        AIRPLANE,
        SUPERMAN,
        UNKNOWN;

        static BirdType of(String type) {
            return Arrays.stream(values())
                .filter(value -> value.name().equalsIgnoreCase(type))
                .findFirst()
                .orElse(UNKNOWN);
        }
    }
}
