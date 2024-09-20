package com.example.refactoring.extract_method.split_phase;

import com.example.refactoring.split_phase.BeforeSplitPhase;
import org.junit.jupiter.api.Test;

class BeforeSplitPhaseTest {

    @Test
    void orderProcess() {
        new BeforeSplitPhase().orderProcess("1-2 3");
    }
}