package com.design.state.demo;

public class Context {
    public static ClosingState closingState = new ClosingState();
    public static OpeningState openingState = new OpeningState();
    public static RunningState runningState = new RunningState();
    public static StoppingState stoppingState = new StoppingState();

    private LiftState liftState;

    public Context(LiftState liftState) {
        this.liftState = liftState;
    }

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
    }

    public void close() {
        this.liftState.close();
    }

    public void open() {
        this.liftState.open();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
