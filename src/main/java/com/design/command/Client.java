package com.design.command;

public class Client {
    public static void main(String[] args) {
        // 声明调用者Invoker
        Invoker invoker = new Invoker();
        // 定义一个命令
        ConcreteCommand1 command = new ConcreteCommand1();
        // 把命令交给调用者执行
        invoker.setCommand(command);
        invoker.action();
    }
}
