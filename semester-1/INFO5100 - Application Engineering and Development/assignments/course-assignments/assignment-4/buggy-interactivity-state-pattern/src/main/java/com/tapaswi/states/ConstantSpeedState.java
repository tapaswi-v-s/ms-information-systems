package com.tapaswi.states;

import com.tapaswi.BuggyOperations;

public class ConstantSpeedState extends BuggyState {

    public ConstantSpeedState() {
        speed = 5;
    }

    @Override
    public void pressLeftPedal(BuggyOperations buggy, int seconds) {
        buggy.setState(new ForwardState());
    }

    @Override
    public void pressRightPedal(BuggyOperations buggy, int seconds) {
        speed = Math.max(speed - 1, 0);
        if (speed == 0) {
            buggy.setState(new RestState());
        }
    }
}

