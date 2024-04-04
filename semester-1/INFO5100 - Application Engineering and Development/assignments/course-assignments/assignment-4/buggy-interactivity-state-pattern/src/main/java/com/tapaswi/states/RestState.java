package com.tapaswi.states;

import com.tapaswi.BuggyOperations;

public class RestState extends BuggyState {

    @Override
    public void pressLeftPedal(BuggyOperations buggy, int seconds) {
        if(seconds >= 3)
            buggy.setState(new BackwardState()); // At rest and pressing for more than 3 seconds
        else
            buggy.setState(new ForwardState());
    }
}
