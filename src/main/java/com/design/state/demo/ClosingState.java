package com.design.state.demo;

public class ClosingState extends LiftState {

    @Override
    public void close() {
        System.out.println("关闭电梯...");
    }

    @Override
    public void open() {
        super.context.setLiftState(Context.openingState);
        super.context.open();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.run();
    }

    @Override
    public void stop() {
        System.out.println("[close-->stop] 无法执行");
    }

}
