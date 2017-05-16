package com.design.state.demo;

public class RunningState extends LiftState {

    @Override
    public void close() {
        System.out.println("[run-->close] �޷�ִ��");
    }

    @Override
    public void open() {
        System.out.println("[run-->stop] �޷�ִ��");
    }

    @Override
    public void run() {
        System.out.println("��������...");
    }

    @Override
    public void stop() {
        this.context.setLiftState(Context.stoppingState);
        this.context.stop();
    }

}
