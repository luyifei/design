package com.design.state.demo;

public class RunningState extends LiftState {

    @Override
    public void close() {
        System.out.println("[run-->close] 无法执行");
    }

    @Override
    public void open() {
        System.out.println("[run-->stop] 无法执行");
    }

    @Override
    public void run() {
        System.out.println("电梯运行...");
    }

    @Override
    public void stop() {
        this.context.setLiftState(Context.stoppingState);
        this.context.stop();
    }

}
