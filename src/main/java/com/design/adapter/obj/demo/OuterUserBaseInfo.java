package com.design.adapter.obj.demo;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo {

    @Override
    public Map getUserBaseInfo() {
        HashMap<String, String> userBaseInfo = new HashMap<>(); 
        userBaseInfo.put("userName", "userName");
        return userBaseInfo;
    }

}
