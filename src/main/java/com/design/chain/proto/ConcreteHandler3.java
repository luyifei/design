package com.design.chain.proto;

public class ConcreteHandler3 extends Handler {

    @Override
    public Level getHandlerLevel() {
        // ��ȡ�ȼ�
        return null;
    }

    @Override
    public Response getResponse(Request request) {
        // ����ҵ���߼�
        System.out.println("ConcreteHandler3ҵ����");
        return null;
    }

}
