package com.design.chain.proto;

public class ConcreteHandler2 extends Handler {

    @Override
    public Level getHandlerLevel() {
        // ��ȡ�ȼ�
        return null;
    }

    @Override
    public Response getResponse(Request request) {
        // ����ҵ���߼�
        System.out.println("ConcreteHandler2ҵ����");
        return null;
    }

}
