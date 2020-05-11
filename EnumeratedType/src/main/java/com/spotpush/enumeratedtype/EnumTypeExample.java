package com.spotpush.enumeratedtype;

import com.sun.xml.internal.messaging.saaj.soap.SOAPPartImpl;
import java.util.EnumSet;
import javafx.scene.input.GestureEvent;


/**
* Enum is a data type consisting of a set of named variables
* @author Stephen Hardy @ spotpush.com
*/

public class EnumTypeExample {

    /**
     * Enum declaration as public methods
     * Enum are constants i.e. it's value doesn't change
     */
    
    public enum Level {
        High,Medium,Low
    }
    
    public enum Size {
        ExtraSmall,Small,Medium,Large,ExtraLarge,ExtraExtraLarge
    }
    
    public enum trafficLights {
        Red,Amber,Green
    }
    
    /**
     * This enum declaration provides a mechanism for referencing each day 
     * of the week by a number
     */
    public enum daysOfTheWeek {
        Monday (1), //enum fields (1)
        Tuesday (2),
        Wednesday (3),
        Thursday (4),
        Friday (5),
        Saturday (6),
        Sunday (7); //semicolon needed when fields (dayCode) and method follows
        
        private final int dayCode;
        
        private daysOfTheWeek(int dayCode) {
            this.dayCode = dayCode;
        }
        
        /**
         * Gives access to the field value of each day within the enum
         * @return 
         */
        public int getDayCode() {
            return this.dayCode;
        }
    }
   
    public enum monthsOfTheYear {
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December
    }
    
           
    public static void main(String[] args) {
    
        /**
         * Reference elements within an enum
         */
        
        Level level = Level.High;
        Size size = Size.Small;
        trafficLights tl = trafficLights.Green;
        String levelText = Level.High.toString();
        
        System.out.println("if-statement using Enum");
        if (level == Level.High) {
            System.out.println("Level is High: "+level);
        } else if (level == Level.Medium) {
            System.out.println("Level is: "+level);
        } else if (level == Level.Low) {
            System.out.println("Level is: "+level);
        }
        
        System.out.println("switch-statement using Enum");
        switch (tl) {
            case Red:
                System.out.println("Stop - Traffic Light is on: "+tl);
                break;
            case Amber:
                System.out.println("Get Ready - Traffic Light is on: "+tl);
                break;
            case Green:
                System.out.println("Go - Traffic Light is on: "+tl);
                break;
        }
                
        System.out.println("iterate values of a Enum");
        for(Level l : Level.values()) {
            System.out.println(l);
        }
        
        for (Size s : Size.values()) {
            System.out.println(s);
        }
        
        for (trafficLights t : trafficLights.values()) {
            System.out.println(t);
        }
        
        /**
         * toString() method giving a string value of the 
         * referenced enum when compiled
         */
        System.out.println("toString() levelText: "+levelText);
        
        /**
         * Direct printing of enum.  The toString() method will be called
         * behind the scenes printing "High"
         */
        System.out.println(Level.High);
        
        /**
         * valueOf() method can be used to obtain an instance of the enum class
         * for a given String value
         */
        
        Level level1 = Level.valueOf("High");
        
        /**
         * Print the filed value for Friday (5)
         */
        daysOfTheWeek dOTW = daysOfTheWeek.Friday;        
        System.out.println("Corresponding field value of day of the week: "
                + dOTW.getDayCode());
        
        /**
         * EnumSet implementation holds a set of elements from the enum
         */
        EnumSet<daysOfTheWeek> enumset = EnumSet.of(daysOfTheWeek.Monday);
                
        /** 
         * EnumMap
         */
        
                
        
    }
}
