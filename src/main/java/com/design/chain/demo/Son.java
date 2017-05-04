package com.design.chain.demo;

public class Son extends Handler{

    public Son() {
        super(Handler.SON_LEVEL_REQUSET);
    }

    @Override
    public void response(IWomen women) {
        //自己的业务逻辑
        System.out.println("-----母亲向儿子请示-----");
        women.getRequest();
        System.out.println("儿子的答复是：同意");
    }

}
