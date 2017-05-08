package com.design.adapter.obj.demo;

/**
 * ����������ģʽ
 * 
 * @author User
 *
 */
public class Client {
    public static void main(String[] args) {
        IOuterUserBaseInfo outerUserBaseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo outerUserHomeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo outerUserOfficeInfo = new OuterUserOfficeInfo();

        IUserInfo outeruserInfo = new OuterUserInfo(outerUserBaseInfo, outerUserHomeInfo, outerUserOfficeInfo);

        outeruserInfo.getOfficeTelNumber();
    }
}
