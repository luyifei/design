package com.design.command;

public abstract class Command {
    // 定义一个子类的全局共享遍历
    protected final Reciver reciver;

    // 实现类必须定义个接收者
    public Command(Reciver reciver) {
        this.reciver = reciver;
    }

    // 每个命令类都有一个执行命令的方法
    public abstract void execute();
}
