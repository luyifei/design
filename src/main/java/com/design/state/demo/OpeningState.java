package com.design.state.demo;

public class OpeningState extends LiftState {

    @Override
    public void close() {
        this.context.setLiftState(Context.closingState);
        this.context.close();
    }

    @Override
    public void open() {
        System.out.println("�����Ŵ�...");
    }

    @Override
    public void run() {
        System.out.println("[open-->run] �޷�ִ��...");
    }

    @Override
    public void stop() {
        System.out.println("[open-->stop] �޷�ִ��...");
    }

}
