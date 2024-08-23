package MentorTasks.lesson19;

import java.util.concurrent.BlockingDeque;

public class Lock {

    private final Object lock = new Object();
    private volatile boolean isNumberTurn = true;

    public boolean isNumberTurn() {
        return isNumberTurn;
    }

    public void setNumberTurn(boolean numberTurn) {
        isNumberTurn = numberTurn;
    }

}