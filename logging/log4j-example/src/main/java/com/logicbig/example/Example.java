package com.logicbig.example;

import org.apache.log4j.Logger;

public class Example {
    final static Logger LOGGER = Logger.getLogger(Example.class);

    public static void main(String[] args) {
        LOGGER.info("a test message");
    }
}