package com.design.command;

public abstract class Command {
    // ����һ�������ȫ�ֹ������
    protected final Reciver reciver;

    // ʵ������붨���������
    public Command(Reciver reciver) {
        this.reciver = reciver;
    }

    // ÿ�������඼��һ��ִ������ķ���
    public abstract void execute();
}
