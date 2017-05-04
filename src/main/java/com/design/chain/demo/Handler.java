package com.design.chain.demo;

public abstract class Handler {
    public final static int FATHER_LEVEL_REQUSET = 1;
    public final static int HUSBAND_LEVEL_REQUSET = 2;
    public final static int SON_LEVEL_REQUSET = 3;
    // �ܴ���ļ���
    private int level = 0;
    private Handler nextHandler;

    // ��ǰ���󼶱�
    public Handler(int level) {
        this.level = level;
    }

    // ��һ���ڴ�����
    public void setHandler(Handler handler) {
        this.nextHandler = handler;
    }

    // ��������
    public void handlerMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                // ��һ���ڴ�����
                this.nextHandler.handlerMessage(women);
            } else {
                System.out.println("----�޺�������----");
            }
        }
    }

    // ��ǰ����Ļ�Ӧ
    public abstract void response(IWomen women);
}
