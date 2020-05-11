package com.spotpush.jul;
/**
* Create a sequence of LogFiles
* Here we specific a FILE_SIZE (1k), when sample.log exceeds FILE_SIZE  
* a new file is created up-to a max of SEQUESNCE (3) sample.log files
* sample.log.0
* sample.log.1
* sample.log.2
* @author Stephen Hardy @ spotpush.com
*/

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SequenceLogFile {

    public static final int FILE_SIZE = 1024;
    public static final Logger LOGGER = Logger.getLogger(SequenceLogFile.class.getName());
    public static final int SEQUENCE = 3;
    
    public static void main(String[] args) throws IOException {
    
        try {
            FileHandler fh = new FileHandler("sample.log",FILE_SIZE,SEQUENCE,true);
            fh.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fh);
            LOGGER.setUseParentHandlers(false);
        } catch (IOException e) {
            LOGGER.warning("Failed to initialise logger handler.");
        }
        LOGGER.info("Logging info message");
        LOGGER.warning("Logging warning message");
    }
}
