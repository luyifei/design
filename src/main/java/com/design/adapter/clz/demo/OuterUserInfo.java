package com.design.adapter.clz.demo;

public class OuterUserInfo extends OuterUser implements IUserInfo{

    @Override
    public String getUserName() {
        super.getUserBaseInfo().get("UserName");
        return null;
    }

    @Override
    public String getHomeAddr() {
        super.getUserHomeInfo().get("HomeAddr");
        return null;
    }

    @Override
    public String getMobileNumber() {
        super.getUserBaseInfo().get("MobileNumber");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println(super.getUserOfficeInfo().get("officeNumber"));
        return null;
    }

    @Override
    public String getJobPosition() {
        super.getUserOfficeInfo().get("JobPosition");
        return null;
    }

}
