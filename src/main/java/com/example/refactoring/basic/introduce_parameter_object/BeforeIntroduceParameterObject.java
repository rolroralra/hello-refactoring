package com.example.refactoring.basic.introduce_parameter_object;

import java.time.LocalDate;

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
