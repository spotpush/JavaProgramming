package com.spotpush.jul;
/**
* 
* @author Stephen Hardy @ spotpush.com
*/
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConditionalLoggingExample {

    private static final Logger LOGGER = Logger.getLogger(ConditionalLoggingExample.class.getName());
    
    public void Method() {
        
        if(LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info("Entering executeMethod() at: "+new Date());
        }
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                System.out.print(i+j+" ");
            }
        } System.out.println("");
  

        if(LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info("Exiting executeMethod() at: "+new Date());
        }
    }

    
    public static void main(String[] args) {
    
        ConditionalLoggingExample example = new ConditionalLoggingExample();
        example.Method();
        
    }
}
