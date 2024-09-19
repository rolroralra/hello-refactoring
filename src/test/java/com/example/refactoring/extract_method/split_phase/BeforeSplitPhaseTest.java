package com.example.refactoring.extract_method.split_phase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeforeSplitPhaseTest {

    @Test
    void orderProcess() {
        new BeforeSplitPhase().orderProcess("1-2 3");
    }
}