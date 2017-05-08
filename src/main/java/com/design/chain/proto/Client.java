package com.design.chain.proto;

/**
 * ������ģʽ
 * @author User
 *
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request();
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        // ����������˳��
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        // ��ȡ������
        Response response = handler1.handlerRequest(request);

    }
}
