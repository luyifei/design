package com.design.chain.demo;

public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL_REQUSET);
    }

    @Override
    public void response(IWomen women) {
        //�Լ���ҵ���߼�
        System.out.println("-----Ů��������ʾ-----");
        women.getRequest();
        System.out.println("���׵Ĵ��ǣ�ͬ��");
    }

}
