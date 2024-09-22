package com.example.refactoring.conditional.replace_conditional_with_polymorphism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AfterReplaceConditionalWithPolymorphismTest {

    @ParameterizedTest(name = "fly({0}) = {1}")
    @CsvSource({
        "bird, bird is flying",
        "airplane, airplane is flying",
        "superman, superman is flying",
        "god, unknown type"
    })
    void fly(String type, String expected) {
        assertThat(AfterReplaceConditionalWithPolymorphism.fly(type))
            .isEqualTo(expected);
    }
}