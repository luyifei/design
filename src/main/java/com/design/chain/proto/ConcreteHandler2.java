package com.design.chain.proto;

public class ConcreteHandler2 extends Handler {

    @Override
    public Level getHandlerLevel() {
        // 获取等级
        return null;
    }

    @Override
    public Response getResponse(Request request) {
        // 处理业务逻辑
        System.out.println("ConcreteHandler2业务处理");
        return null;
    }

}
