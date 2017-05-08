package com.design.adapter.clz.demo;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

    @Override
    public Map getUserBaseInfo() {
        HashMap<String, String> userBaseInfo = new HashMap<>(); 
        userBaseInfo.put("userName", "userName");
        return userBaseInfo;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap<String, String> userOfficeInfo = new HashMap<>(); 
        userOfficeInfo.put("officeNumber", "officeNumber");
        return userOfficeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap<String, String> userHomeInfo = new HashMap<>(); 
        userHomeInfo.put("homeNumber", "homeNumber");
        return userHomeInfo;
    }

}
