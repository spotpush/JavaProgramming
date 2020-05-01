package com.spotpush.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SLF4JExample {
   public static void main(String[] args) {
      
      //Creating the Logger object
      Logger logger = LoggerFactory.getLogger(SLF4JExample.class);
      Integer age = 23;
      
      //Logging the information
      logger.info("At the age of {} ramu got his first job", age);
   }
}