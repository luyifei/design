package com.design.command;

public class Client {
    public static void main(String[] args) {
        // ����������Invoker
        Invoker invoker = new Invoker();
        // ����һ������
        ConcreteCommand1 command = new ConcreteCommand1();
        // �������������ִ��
        invoker.setCommand(command);
        invoker.action();
    }
}
