package com.design.chain.demo;

public class Husband extends Handler{

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUSET);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("-----�������ɷ���ʾ-----");
        women.getRequest();
        System.out.println("�ɷ�Ĵ��ǣ�ͬ��");
    }
    
}
