package com.design.chain.proto;

public class ConcreteHandler1 extends Handler {

    @Override
    public Level getHandlerLevel() {
        // ���صȼ�
        return null;
    }

    @Override
    public Response getResponse(Request request) {
        // ҵ����
        System.out.println("ConcreteHandler1ҵ����");
        return null;
    }

}
