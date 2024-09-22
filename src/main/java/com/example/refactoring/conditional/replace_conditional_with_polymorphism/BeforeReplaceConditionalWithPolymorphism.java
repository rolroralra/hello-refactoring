package com.example.refactoring.conditional.replace_conditional_with_polymorphism;

import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class BeforeReplaceConditionalWithPolymorphism {

    public static String fly(String type) {
        return switch (type) {
            case "bird" -> "bird is flying";
            case "airplane" -> "airplane is flying";
            case "superman" -> "superman is flying";
            default -> "unknown type";
        };
    }
}
