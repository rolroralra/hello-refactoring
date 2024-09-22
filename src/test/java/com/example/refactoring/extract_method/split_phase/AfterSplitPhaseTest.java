package com.example.refactoring.extract_method.split_phase;

import com.example.refactoring.basic.split_phase.AfterSplitPhase;
import org.junit.jupiter.api.Test;

class AfterSplitPhaseTest {

    @Test
    void orderProcess() {
        new AfterSplitPhase().orderProcess("1-2 3");
    }
}