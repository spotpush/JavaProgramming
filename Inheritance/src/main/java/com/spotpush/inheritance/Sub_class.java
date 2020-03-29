/*
The user of the Super Keyword
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.inheritance;
/* Imports */


class Super_class 
{
    int num = 20;
    
    //display method of superclass
    public void display() {
        System.out.println("This is the display method of superclass");
    }
}

public class Sub_class extends Super_class {
    
    int num = 10;
    
    //display method of subclass
    public void display() {
        System.out.println("This is the display method of subclass");
    }
    
    public void my_method() {
    
        //instantiate subclass
        Sub_class sub = new Sub_class();
        
        //Invoke the display() method of Sub_class
        sub.display();
        
        //invoke the display() method of Super_class
        super.display();
                
        //printing the value of variable num of subclass
        System.out.println("Value of the variable named num in sub class: "+sub.num);
        
        //printing the value of the varable num of superclass
        System.out.println("Value of the variable named num in super class: "+super.num);
    }
    
    public static void main(String[] args) 
    {
        Sub_class obj = new Sub_class();
        obj.my_method();
    }
}
