package com.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class A {
    private static Logger logger = LoggerFactory.getLogger(A.class);

    public void test() {
        logger.info("1234");
    }
}
