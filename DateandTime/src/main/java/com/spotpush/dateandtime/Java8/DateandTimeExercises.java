package com.spotpush.dateandtime.Java8;

import java.util.Calendar;
import sun.util.spi.CalendarProvider;


/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class DateandTimeExercises {

    /**
     * Declaring this instance of Calender here allows it to be used over and 
     * over again
     */
    static Calendar now = Calendar.getInstance();
    
    /**
     * Calender Class was introduced in Java7
     */
    static void dateObjectCalendarClass() {
        System.out.println("Create a Date object using the Calendar class");
        System.out.println(now.getTime());
    }
    
    static void dateInformation() {
        System.out.println("Display information (year, month, day, hour, minute) of a default calendar.");
        int y = now.get(Calendar.YEAR);
        int m = now.get(Calendar.MONTH);
        int d = now.get(Calendar.DAY_OF_WEEK);
        int h = now.get(Calendar.HOUR_OF_DAY);
        int mi = now.get(Calendar.MINUTE);
        int s = now.get(Calendar.SECOND);
        System.out.println(y+" : "+m+" : "+d+" : "+h+":"+mi+":"+s);
    }
    
    static void maxValueOfYear() {
        System.out.println("get the maximum value of the year, month, week, date from the current date of a default calendar.");
        int maxY = now.getMaximum(Calendar.YEAR);
        int maxM = now.getMaximum(Calendar.MONTH);//11?
        int maxD = now.getMaximum(Calendar.DAY_OF_WEEK);//7
        int maxW = now.getMaximum(Calendar.WEEK_OF_YEAR);//53? starts at 0
        int minW = now.getMinimum(Calendar.WEEK_OF_YEAR);
        System.out.println(maxY+", "+maxM+", "+maxD+", "+maxW);
        System.out.println(minW);
    }
    
    
    
    
    public static void main(String[] args) {
        
        dateObjectCalendarClass();//Q1
        dateInformation();//Q2
        maxValueOfYear();//Q3
        
    }
}
