package com.spotpush.dateandtime.Java8;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;

/**
* Java8 Date and Time API 
* @author Stephen Hardy @ spotpush.com
*/


public class Java8DandAndTimeAPI {

    /**
     * The instant class is defined as an offset since origin (epoch) which is
     * defined as Jan 1st 1970 - 00:00 GMT
     * Time is measured using 86.400 seconds per day ((86400/60)/60))=24hrs
     */
    static void timeInstant() {
    
        Instant now = Instant.now();
        Instant laterSeconds = now.plusSeconds(3);
        Instant laterMillis = now.plusMillis(3);
        Instant laterNanos = now.plusNanos(3);
        Instant earlierSeconds = now.minusSeconds(3);
        Instant earlierMillis = now.minusMillis(3);
        Instant earlierNanos = now.minusNanos(3);
        System.out.println("===============================================");
        System.out.println("Now: "+now);
        System.out.println("===============================================");
        System.out.println("3 Seconds Later: "+laterSeconds);
        System.out.println("3 Millis Later: "+laterMillis);
        System.out.println("3 Nanos Later: "+laterNanos);
        System.out.println("===============================================");
        System.out.println("3 Seconds Earlier: "+earlierSeconds);
        System.out.println("3 Millis Earlier: "+earlierMillis);
        System.out.println("3 Nanos Earlier: "+earlierNanos);
        System.out.println("===============================================");
    }
    
    
    /**
     * Duration represents a period of time between 2 Instant objects 
     * Duration instance is immutable
     * It's possible to create a duration based on another duration via 
     * calculation methods
     */
    static void timeDuration() {
        Instant startTime = Instant.now();
        Instant endTime = Instant.now().plusSeconds(30); //give a diff endTime
        Duration elapsedTime = Duration.between(startTime, endTime);
        System.out.println("Duration is split into Seconds and Nanos to access \n"
                + "each part call getSeconds() and/or getNanos() \n"
                + elapsedTime.getSeconds()+":"+elapsedTime.getNano());
        System.out.println("Converts the full time duration to Nanos: "+elapsedTime.toNanos());
        System.out.println("Millis: "+elapsedTime.toMillis());
        System.out.println("Minutes: "+elapsedTime.toMinutes());
        System.out.println("Hours: "+elapsedTime.toHours());
        System.out.println("Days: "+elapsedTime.toDays());
    }
    
    /**
     * localDate() is a date without time zone information
     * localDate() represents a specific date in the year such as a Bank Holiday, 
     * Birthday not a specific time when the day starts
     * localDate() objects are immutable so all calculations return a new localDate()
     */
    static void localDate() {
        LocalDate localDate = LocalDate.now();
        LocalDate specificLocalDate = LocalDate.of(1978,07,03);
        System.out.println("Machine generated: YYYY-MM-DD "+localDate);
        System.out.println("Specified Date: YYYY-MM-DD "+specificLocalDate);
        System.out.println("===============================================");
        System.out.println("To extract specific iformation from a LocalDate");
        int year = localDate.getYear();
        Month month = localDate.getMonth(); //Month is an enum
        int dotm = localDate.getDayOfMonth();
        int doty = localDate.getDayOfYear();
        DayOfWeek dotw = localDate.getDayOfWeek(); //DayOfTheWeek is an enum
        System.out.println("Year: "+year+
                "\nMonth: "+month+
                "\nDay of the Month: "+dotm+
                "\nDay of the Year: "+doty+
                "\nDay of the Week: "+dotw);
        
        LocalDate baseLocalDate = LocalDate.of(2020,01,01);
        System.out.println("Base Local Date: "+baseLocalDate);
        LocalDate futureYears = baseLocalDate.plusYears(5);
        System.out.println("Future Years +5: "+futureYears);
        LocalDate futureMonths = baseLocalDate.plusMonths(6);
        System.out.println("Future Months +6: "+futureMonths);
    }
    
    static void localDateTime() {
        
    }
    
    static void localTime() {
        
    }
    
    static void zonedDateTime() {
        
    }
    
    static void dateTimeFormatter() {
        
    }
    
    public static void main(String[] args) {
    
        
        timeInstant();
        timeDuration();
        localDate();
    }
}
