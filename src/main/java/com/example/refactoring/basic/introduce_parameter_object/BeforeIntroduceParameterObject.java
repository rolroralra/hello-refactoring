package com.example.refactoring.basic.introduce_parameter_object;

import java.time.LocalDate;

/**
 * Introduce Parameter Object (매개변수 객체 만들기)
 * <br/><br/>
 * Introduce Parameter Object for method parameters
 */
public class BeforeIntroduceParameterObject {

    public void amountInvoiced(LocalDate startDate, LocalDate endDate) {
        // ...

    }

    public void amountReceived(LocalDate startDate, LocalDate endDate) {
        // ...
    }

    public void amountOverdue(LocalDate startDate, LocalDate endDate) {
        // ...

    }

}
