package com.tapaswi;

import com.tapaswi.states.BuggyState;
import com.tapaswi.states.RestState;

public class BuggyOperations {
    private BuggyState state = new RestState();

    public void setState(BuggyState state) {
        this.state = state;
    }

    public BuggyState getState() {
        return state;
    }

    public void pressLeftPedal(int seconds) {
        state.pressLeftPedal(this, seconds);
    }

    public void pressRightPedal(int seconds) {
        state.pressRightPedal(this, seconds);
    }
}
