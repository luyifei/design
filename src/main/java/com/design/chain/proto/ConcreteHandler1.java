package com.design.chain.proto;

public class ConcreteHandler1 extends Handler {

    @Override
    public Level getHandlerLevel() {
        // 返回等级
        return null;
    }

    @Override
    public Response getResponse(Request request) {
        // 业务处理
        System.out.println("ConcreteHandler1业务处理");
        return null;
    }

}
