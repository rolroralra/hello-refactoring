package com.example.refactoring.basic.introduce_parameter_object;

import static org.assertj.core.api.Assertions.assertThatNoException;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class BeforeIntroduceParameterObjectTest {

    @Test
    void amountInvoiced() {
        BeforeIntroduceParameterObject beforeIntroduceParameterObject = new BeforeIntroduceParameterObject();
        assertThatNoException().isThrownBy(() ->
            beforeIntroduceParameterObject.amountInvoiced(LocalDate.now(), LocalDate.now()));
    }

    @Test
    void amountReceived() {
        BeforeIntroduceParameterObject beforeIntroduceParameterObject = new BeforeIntroduceParameterObject();
        assertThatNoException().isThrownBy(() ->
            beforeIntroduceParameterObject.amountReceived(LocalDate.now(), LocalDate.now()));
    }

    @Test
    void amountOverdue() {
        BeforeIntroduceParameterObject beforeIntroduceParameterObject = new BeforeIntroduceParameterObject();
        assertThatNoException().isThrownBy(() ->
            beforeIntroduceParameterObject.amountOverdue(LocalDate.now(), LocalDate.now()));
    }

}