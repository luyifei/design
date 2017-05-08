package com.design.decorator.proto;

public class ConcreteComponent extends Component{

    @Override
    public void operate() {
        System.out.println("具体构件的行为...");
    }

}
