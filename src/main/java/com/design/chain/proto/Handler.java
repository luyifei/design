package com.design.chain.proto;

public abstract class Handler {
    // ��һ��������
    private Handler nextHandler;

    // ��ȡ�ȼ�
    public abstract Level getHandlerLevel();

    // ��ûظ�
    public abstract Response getResponse(Request request);

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    public Response handlerRequest(Request request) {
        // �ж��Ƿ������Լ��ж�
        if (request.getLevel().equals(this.getHandlerLevel())) {
            return this.getResponse(request);
        } else {
            // ����һ�������ߣ�������һ��
            if (this.nextHandler != null) {
                return this.nextHandler.handlerRequest(request);
            } else {
                return null;
            }
        }
    }
}
