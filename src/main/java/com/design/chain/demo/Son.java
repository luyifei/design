package com.design.chain.demo;

public class Son extends Handler{

    public Son() {
        super(Handler.SON_LEVEL_REQUSET);
    }

    @Override
    public void response(IWomen women) {
        //�Լ���ҵ���߼�
        System.out.println("-----ĸ���������ʾ-----");
        women.getRequest();
        System.out.println("���ӵĴ��ǣ�ͬ��");
    }

}
