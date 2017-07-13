package com.log;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.test();
        Son son = new Son();
        son.log();
        
        Parent p = new Parent();
        p.testP();
    }
}
