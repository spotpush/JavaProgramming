package com.spotpush.jul;
/**
* Prevent the logger from sending log messages to it's parent logger
* @author Stephen Hardy @ spotpush.com
*/
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;


public class NoParentLogging {

    private static final Logger LOGGER = Logger.getLogger(NoParentLogging.class.getName());
    
    public static void main(String[] args) {
        
        String loggerName = LOGGER.getName();
        
        LOGGER.setUseParentHandlers(false);
        LOGGER.addHandler(new ConsoleHandler());
        LOGGER.info("Logging an info message");
        
        System.out.println(loggerName);
        
    }
}
