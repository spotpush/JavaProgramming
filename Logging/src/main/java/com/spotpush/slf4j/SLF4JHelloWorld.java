package com.spotpush.slf4j;
/**
* 
* @author Stephen Hardy @ spotpush.com
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JHelloWorld {
  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(SLF4JHelloWorld.class);
    logger.info("Hello World");
  }
}