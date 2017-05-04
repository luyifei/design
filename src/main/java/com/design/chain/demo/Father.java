package com.design.chain.demo;

public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL_REQUSET);
    }

    @Override
    public void response(IWomen women) {
        //自己的业务逻辑
        System.out.println("-----女儿向父亲请示-----");
        women.getRequest();
        System.out.println("父亲的答复是：同意");
    }

}
