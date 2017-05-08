package com.design.adapter.obj.demo;

/**
 * 对象适配器模式
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
