package com.design.chain.demo;

public class Women implements IWomen {
    private int type = 0;
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        switch (this.type) {
        case 1:
            this.request = "女儿的请求是：" + request;
            break;
        case 2:
            this.request = "妻子的请求是：" + request;
            break;
        case 3:
            this.request = "丈夫的请求是：" + request;
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
