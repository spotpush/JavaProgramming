package com.spotpush.objectserialization.employee;

import java.io.Serializable;

/**
 * Employee object that implement serialization
 * For a class to be serialised it must;
 * - Implement java.io.Serializable
 * - All fields must be serializable if not then marked transient
 * - Serializable is a market interface with no methods.  It's used
 * to mark classes for Serialization 
 * @author Stephen Hardy @ spotpush.com
*/

public class Employee implements Serializable {

    private static final long serialVersionUID = 2L;

    
    
    //public String age;
    public String name;
    public String address;
    //JVM ignores transient and static variables for Serialization
    //transient variables may be confidential data; passwords, salary, personal info
    //or data that changes from state to state and is not relevant to an objects 
    //future state such as date and time 
    public transient int SSN; //social security number
    public int number;
    
    public void mailCheck() {
        System.out.println("Mailing a check to "
        + name + " "+ address);
    }
    
    public static void main(String[] args) {
        
    }
}
