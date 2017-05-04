package com.design.chain.demo;

public abstract class Handler {
    public final static int FATHER_LEVEL_REQUSET = 1;
    public final static int HUSBAND_LEVEL_REQUSET = 2;
    public final static int SON_LEVEL_REQUSET = 3;
    // 能处理的级别
    private int level = 0;
    private Handler nextHandler;

    // 当前对象级别
    public Handler(int level) {
        this.level = level;
    }

    // 下一环节处理人
    public void setHandler(Handler handler) {
        this.nextHandler = handler;
    }

    // 处理请求
    public void handlerMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                // 下一环节处理人
                this.nextHandler.handlerMessage(women);
            } else {
                System.out.println("----无后续处理----");
            }
        }
    }

    // 当前对象的回应
    public abstract void response(IWomen women);
}
