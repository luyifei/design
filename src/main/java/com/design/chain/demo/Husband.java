package com.design.chain.demo;

public class Husband extends Handler{

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUSET);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("-----妻子向丈夫请示-----");
        women.getRequest();
        System.out.println("丈夫的答复是：同意");
    }
    
}
