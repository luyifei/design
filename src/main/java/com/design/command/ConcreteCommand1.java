package com.design.command;

public class ConcreteCommand1 extends Command {
    public ConcreteCommand1() {
        super(new ConcreteReciver1());
    }

    public ConcreteCommand1(Reciver reciver) {
        super(reciver);
    }

    @Override
    public void execute() {
        // 业务处理
        this.reciver.doSomething();
    }

}
