package com.design.adapter.obj.demo;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

    @Override
    public Map getUserOfficeInfo() {
        HashMap<String, String> userOfficeInfo = new HashMap<>(); 
        userOfficeInfo.put("officeNumber", "officeNumber");
        return userOfficeInfo;
    }

}
