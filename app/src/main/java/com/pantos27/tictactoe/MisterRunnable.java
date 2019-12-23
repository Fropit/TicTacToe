package com.pantos27.tictactoe;

/***
 * A nicer runnable interface
 */
public interface MisterRunnable extends Runnable {
    boolean isRunning();
    void  onFinish();
}
