package com.design.state.demo;

public class Client {

    public static void main(String[] args) {
        
        Context context = new Context(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
        context.stop();
        context.run();
        context.open();
    }

}
