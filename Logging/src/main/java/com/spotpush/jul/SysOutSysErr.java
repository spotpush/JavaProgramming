package com.spotpush.jul;

/**
* Java.util.logger (jul)
* Writing System.out and System.err messages to Log File
* @author Stephen Hardy @ spotpush.com
*/
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SysOutSysErr {

    private static final Logger LOGGER = Logger.getLogger(SysOutSysErr.class.getName());
    
    public static void main(String[] args) throws IOException {
        //create a FileHandler
        Handler fh = new FileHandler("SysOutSysErr.log", true);
        fh.setFormatter(new SimpleFormatter());
        LOGGER.addHandler(fh);
        LOGGER.setLevel(Level.FINE);
        
        //redirect Sys.out & Sys.err
        PrintStream outPS = new PrintStream(new BufferedOutputStream
                            (new FileOutputStream("SysOutSysErr.log",true)));
        System.setErr(outPS);
        System.setOut(outPS);
        
        //simulate exeption
        try {
            throw new Exception("Simulating and Exception");
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE,ex.getMessage(),ex);
        }
        
        //log info
        LOGGER.info("This is a info-level message");
        LOGGER.config("This is a config-level message");
        LOGGER.fine("This is a fine-level message");
        LOGGER.finer("This is a finer-level message");
        LOGGER.finest("This is a finest-level message");
        
        System.out.println("Writing to System.out");
        System.err.println("Writing to System.err");
        
        
    }
}
