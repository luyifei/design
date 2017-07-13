package com.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Parent {
    protected Logger logger;

    public Parent() {
        logger = LoggerFactory.getLogger(getClass().getName());
    }
    
    public void testP(){
        logger.info("p123456");
    }
}
