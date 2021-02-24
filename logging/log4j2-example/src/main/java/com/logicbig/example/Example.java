package com.logicbig.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Example {
    final static Logger logger = LogManager.getLogger(Example.class);

    public static void main(String[] args) {
        logger.info("a test info message");
        logger.error("a test error message");
    }
}