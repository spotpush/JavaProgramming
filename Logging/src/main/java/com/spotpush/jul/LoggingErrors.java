package com.spotpush.jul;
/**
* Implementing the logging framework in java.util
* @author Stephen Hardy @ spotpush.com
*/
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingErrors {

    
    //static factory method
    private static final Logger LOGGER = Logger.getLogger(LoggingErrors.class.getName());
    
    public static void main(String[] args) {
        LOGGER.info("Logging begins...");
        try {
            throw new Exception("Simulating and exception");
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE,ex.getMessage(),ex);
        }
        LOGGER.info("Done...");
    
    }
}
