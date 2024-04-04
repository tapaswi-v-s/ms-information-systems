package com.tapaswi;

import com.tapaswi.states.BackwardState;
import com.tapaswi.states.ConstantSpeedState;
import com.tapaswi.states.ForwardState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuggyTest {
    @Test
    public void testDeceleration() {
        BuggyOperations buggy = new BuggyOperations();
        buggy.pressLeftPedal(3);
        assertEquals(0, buggy.getState().speed);
        assertEquals(BackwardState.class, buggy.getState().getClass());
    }

    @Test
    public void testForwardStateWithIncreasedSpeed() {
        BuggyOperations buggy = new BuggyOperations();
        buggy.pressLeftPedal(1); // Transition to ForwardState through RestState
        assertEquals(ForwardState.class, buggy.getState().getClass());
        assertEquals(1, buggy.getState().speed); // No further acceleration
    }

    @Test
    public void testDecelerationWhileMoving() {
        BuggyOperations buggy = new BuggyOperations();
        buggy.pressLeftPedal(1); // Transition to ForwardState through RestState
        assertEquals(ForwardState.class, buggy.getState().getClass());
        buggy.pressLeftPedal(1); // Accelerate
        buggy.pressLeftPedal(1); // Accelerate
        buggy.pressRightPedal(1);
        assertEquals(2, buggy.getState().speed); // Decelerates
    }

    @Test //Constant speed test
    public void testConstantSpeed() throws InterruptedException {
        BuggyOperations buggy = new BuggyOperations();
        buggy.pressLeftPedal(1); // Transition to ForwardState through RestState
        buggy.pressRightPedal(3);
        assertEquals(ConstantSpeedState.class, buggy.getState().getClass());
        assertEquals(5, buggy.getState().speed);
    }
}
