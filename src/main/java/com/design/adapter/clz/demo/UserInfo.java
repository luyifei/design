package com.design.adapter.clz.demo;

public class UserInfo implements IUserInfo {

    @Override
    public String getUserName() {
        System.out.println("用户名");
        return null;
    }

    @Override
    public String getHomeAddr() {
        System.out.println("家庭地址");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("手机号码");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("公司号码");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("工作职位");
        return null;
    }

}
