package com.tapaswi.states;

import com.tapaswi.BuggyOperations;

public class BuggyState {
    public int speed;

    public BuggyState() {
        this.speed = 0;
    }

    public void pressLeftPedal(BuggyOperations buggy, int seconds) {
        // Implement behavior for left pedal press in each subclass
    }

    public void pressRightPedal(BuggyOperations buggy, int seconds) {
        // Implement behavior for right pedal press in each subclass
    }
}
