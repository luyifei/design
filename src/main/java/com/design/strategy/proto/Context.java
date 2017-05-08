package com.design.strategy.proto;

public class Context {
    // �������
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        // ���캯�������������
        this.strategy = strategy;
    }

    public void doSomething() {
        // ���ò��Է���
        this.strategy.doSomething();
    }
}
