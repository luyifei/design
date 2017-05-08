package com.design.chain.proto;

/**
 * 责任链模式
 * @author User
 *
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request();
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        // 设置责任链顺序
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        // 获取处理结果
        Response response = handler1.handlerRequest(request);

    }
}
