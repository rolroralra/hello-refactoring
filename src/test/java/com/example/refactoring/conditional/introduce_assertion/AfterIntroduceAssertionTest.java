package com.example.refactoring.conditional.introduce_assertion;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatNoException;

import org.junit.jupiter.api.Test;

class AfterIntroduceAssertionTest {
    @Test
    void thrownExceptionSomeMethodWhenNegativeParameter() {
        var afterIntroduceAssertion = new AfterIntroduceAssertion();

        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> afterIntroduceAssertion.someMethod(-1))
            .withMessage("value must be greater than 0");
    }

    @Test
    void doNothingSomeMethodWhenPositiveParameter() {
        var afterIntroduceAssertion = new AfterIntroduceAssertion();

        assertThatNoException()
            .isThrownBy(() -> afterIntroduceAssertion.someMethod(1));
    }
}