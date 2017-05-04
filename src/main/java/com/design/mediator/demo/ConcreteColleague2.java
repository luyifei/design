package com.design.mediator.demo;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator meiator) {
        super(meiator);
    }
    
    //自有方法
    public void selfMethod2(){
        //处理自身能处理的逻辑
    }
    //依赖方法
    public void depMethod2(){
        //处理自身逻辑
        //自身处理不了的业务逻辑，委托给中介者处理
        this.meiator.doSomething1();
    }
}
