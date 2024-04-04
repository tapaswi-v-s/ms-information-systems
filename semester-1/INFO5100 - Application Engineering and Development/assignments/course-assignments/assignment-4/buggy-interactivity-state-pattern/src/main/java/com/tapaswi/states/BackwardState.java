package com.tapaswi.states;

import com.tapaswi.BuggyOperations;

public class BackwardState extends BuggyState {
    @Override
    public void pressLeftPedal(BuggyOperations buggy, int seconds) {
        // Cannot accelerate further backward
    }

    @Override
    public void pressRightPedal(BuggyOperations buggy, int seconds) {
        speed = Math.min(speed + 1, 0); // Negative value for backward speed
    }
}


