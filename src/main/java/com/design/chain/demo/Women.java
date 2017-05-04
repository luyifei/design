package com.design.chain.demo;

public class Women implements IWomen {
    private int type = 0;
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        switch (this.type) {
        case 1:
            this.request = "Ů���������ǣ�" + request;
            break;
        case 2:
            this.request = "���ӵ������ǣ�" + request;
            break;
        case 3:
            this.request = "�ɷ�������ǣ�" + request;
            break;
        }
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getRequest() {
        return request;
    }
}
