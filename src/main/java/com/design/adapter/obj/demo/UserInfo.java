package com.design.adapter.obj.demo;

public class UserInfo implements IUserInfo {

    @Override
    public String getUserName() {
        System.out.println("�û���");
        return null;
    }

    @Override
    public String getHomeAddr() {
        System.out.println("��ͥ��ַ");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("�ֻ�����");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("��˾����");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("����ְλ");
        return null;
    }

}
