package com.tapaswi.states;

import com.tapaswi.BuggyOperations;


public class ForwardState extends BuggyState {
    public ForwardState() {
        speed = 1;
    }

    @Override
    public void pressLeftPedal(BuggyOperations buggy, int seconds) {
        speed++;
    }

    @Override
    public void pressRightPedal(BuggyOperations buggy, int seconds) {
        if(seconds >= 3){
            buggy.setState(new ConstantSpeedState());
        }else{
            speed = Math.max(speed - 1, 0);
        }
    }
}
