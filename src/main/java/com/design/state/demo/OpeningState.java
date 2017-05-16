package com.design.state.demo;

public class OpeningState extends LiftState {

    @Override
    public void close() {
        this.context.setLiftState(Context.closingState);
        this.context.close();
    }

    @Override
    public void open() {
        System.out.println("电梯门打开...");
    }

    @Override
    public void run() {
        System.out.println("[open-->run] 无法执行...");
    }

    @Override
    public void stop() {
        System.out.println("[open-->stop] 无法执行...");
    }

}
