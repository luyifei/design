package com.design.chain.proto;

public abstract class Handler {
    // 下一级处理着
    private Handler nextHandler;

    // 获取等级
    public abstract Level getHandlerLevel();

    // 获得回复
    public abstract Response getResponse(Request request);

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    public Response handlerRequest(Request request) {
        // 判断是否属于自己判断
        if (request.getLevel().equals(this.getHandlerLevel())) {
            return this.getResponse(request);
        } else {
            // 有下一级处理者，交给下一级
            if (this.nextHandler != null) {
                return this.nextHandler.handlerRequest(request);
            } else {
                return null;
            }
        }
    }
}
