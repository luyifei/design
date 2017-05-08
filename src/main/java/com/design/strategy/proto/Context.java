package com.design.strategy.proto;

public class Context {
    // 抽象策略
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        // 构造函数创建具体策略
        this.strategy = strategy;
    }

    public void doSomething() {
        // 调用策略方法
        this.strategy.doSomething();
    }
}
