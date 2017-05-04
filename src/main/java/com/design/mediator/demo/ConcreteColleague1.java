package com.design.mediator.demo;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator meiator) {
        super(meiator);
    }
    //自有方法
    public void selfMethod1(){
        //处理自己的业务逻辑
    }
    //依赖方法
    public void depMethod1(){
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑,委托给中介者
        this.meiator.doSomething2();
    }
    
}
