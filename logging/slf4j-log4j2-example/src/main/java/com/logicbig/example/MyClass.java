package com.logicbig.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyClass {

    private static Logger LOGGER = LoggerFactory.getLogger(MyClass.class);

    public static void doSomething() {
        LOGGER.info("a test message");
    }
}