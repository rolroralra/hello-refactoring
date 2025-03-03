package com.example.refactoring.basic.introduce_parameter_object;

import static org.assertj.core.api.Assertions.assertThatNoException;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class AfterIntroduceParameterObjectTest {

    @Test
    void amountInvoiced() {
        AfterIntroduceParameterObject afterIntroduceParameterObject = new AfterIntroduceParameterObject();
        assertThatNoException().isThrownBy(() ->
        {
            DateRange dateRange = new DateRange(LocalDate.now(), LocalDate.now());
            afterIntroduceParameterObject.amountInvoiced(dateRange);
        });
    }

    @Test
    void amountReceived() {
        AfterIntroduceParameterObject afterIntroduceParameterObject = new AfterIntroduceParameterObject();
        assertThatNoException().isThrownBy(() ->
        {
            DateRange dateRange = new DateRange(LocalDate.now(), LocalDate.now());
            afterIntroduceParameterObject.amountReceived(dateRange);
        });
    }

    @Test
    void amountOverdue() {
        AfterIntroduceParameterObject afterIntroduceParameterObject = new AfterIntroduceParameterObject();
        assertThatNoException().isThrownBy(() ->
        {
            DateRange dateRange = new DateRange(LocalDate.now(), LocalDate.now());
            afterIntroduceParameterObject.amountOverdue(dateRange);
        });
    }

}