package com.spotpush.jul;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class LoggingToFile {

    /**
     * static factory method is the best way to call a Logger object and
     * static because there is usually one logger per class
     * fully qualified class name required 'LoggingToFile.class.getName()'
    */
    private static final Logger LOGGER = Logger.getLogger(LoggingToFile.class.getName());
    
    public static void main(String[] args) throws IOException {
        Handler fh = new FileHandler("%t/LogToFile.log",true);
        //default format is XML setFormatter converts it to plain text
        fh.setFormatter(new SimpleFormatter());
        LOGGER.addHandler(fh);
        LOGGER.setLevel(Level.FINE);
        try {
            throw new Exception("Simulating an exception");
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE,ex.getMessage(),ex);
        }
        LOGGER.info("This is a info-level message");
        LOGGER.config("This is a config-level message");
        LOGGER.fine("This is a fine-level message");
        LOGGER.finer("This is a finer-level message");
        LOGGER.finest("This is a finest-level message");
        
        fh.flush();
        fh.close();
    
    }
}
