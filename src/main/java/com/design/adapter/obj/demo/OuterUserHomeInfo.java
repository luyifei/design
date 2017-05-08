package com.design.adapter.obj.demo;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {

    @Override
    public Map getUserHomeInfo() {
        HashMap<String, String> userHomeInfo = new HashMap<>(); 
        userHomeInfo.put("homeNumber", "homeNumber");
        return userHomeInfo;
    }

}
