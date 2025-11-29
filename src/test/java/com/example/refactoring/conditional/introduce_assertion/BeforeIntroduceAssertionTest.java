package com.example.refactoring.conditional.introduce_assertion;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatNoException;

import org.junit.jupiter.api.Test;

class BeforeIntroduceAssertionTest {

    @Test
    void thrownExceptionSomeMethodWhenNegativeParameter() {
        var beforeIntroduceAssertion = new BeforeIntroduceAssertion();

        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> beforeIntroduceAssertion.someMethod(-1))
            .withMessage("value must be greater than 0");
    }

    @Test
    void doNothingSomeMethodWhenPositiveParameter() {
        var beforeIntroduceAssertion = new BeforeIntroduceAssertion();

        assertThatNoException()
            .isThrownBy(() -> beforeIntroduceAssertion.someMethod(1));
    }
}