package com.spotpush.jul;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
* Demonstrate how to log an exception
* @author Stephen Hardy @ spotpush.com
*/

public class LogAnException {

    private static final Logger LOGGER = Logger.getLogger(LogAnException.class.getName());
    
    public static void main(String[] args) {
    
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        try {
            Date date = df.parse("11/08/1984");
            System.out.println("Date = "+date);
        } catch (ParseException e) {
            if(LOGGER.isLoggable(Level.SEVERE)) {
                LOGGER.log(Level.SEVERE,"Error parsing date",e);
            }
        }
    }
}
