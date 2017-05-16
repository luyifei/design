package com.design.state.demo;

public class StoppingState extends LiftState{

    @Override
    public void close() {
        System.out.println("[stop-->close] �޷�ִ��");
    }

    @Override
    public void open() {
        this.context.setLiftState(Context.openingState);
        this.context.open();
    }

    @Override
    public void run() {
        this.context.setLiftState(Context.runningState);
        this.context.run();
    }

    @Override
    public void stop() {
        System.out.println("����ֹͣ...");
    }

}
