package com.spotpush.logginglog4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class Log4jExample {

    private static final Logger LOGGER = LogManager.getLogger(Log4jExample.class);
    public static void main(String[] args) {
        System.out.println("Hello, User!");
        LOGGER.trace("We've just greeted the user!");
        LOGGER.debug("We've just greeted the user!");
            
    }
}
