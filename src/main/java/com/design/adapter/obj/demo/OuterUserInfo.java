package com.design.adapter.obj.demo;

public class OuterUserInfo implements IUserInfo{
    private IOuterUserBaseInfo outerUserBaseInfo;
    private IOuterUserHomeInfo outerUserHomeInfo;
    private IOuterUserOfficeInfo outerUserOfficeInfo;
    public OuterUserInfo(IOuterUserBaseInfo outerUserBaseInfo2, IOuterUserHomeInfo outerUserHomeInfo2,
            IOuterUserOfficeInfo outerUserOfficeInfo2) {
        super();
        this.outerUserBaseInfo = outerUserBaseInfo2;
        this.outerUserHomeInfo = outerUserHomeInfo2;
        this.outerUserOfficeInfo = outerUserOfficeInfo2;
    }
    @Override
    public String getUserName() {
        this.outerUserBaseInfo.getUserBaseInfo().get("UserName");
        return null;
    }
    @Override
    public String getHomeAddr() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String getMobileNumber() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String getOfficeTelNumber() {
        System.out.println(this.outerUserOfficeInfo.getUserOfficeInfo().get("officeNumber"));
        return null;
    }
    @Override
    public String getJobPosition() {
        // TODO Auto-generated method stub
        return null;
    }
    
    
    
}
