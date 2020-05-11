package com.spotpush.annotations.overriding;

/**
* This is the subclass
* 
* The idea behind the @Override annotation is to ensure, at compile time, that
* the method signature of the superclass does;t change without generating
* an error 
* 
* If you change this in BaseClass
*   public void doSomething(String str)
* to
*   public void doSomething(Object str)
* then @Override will error at compile time
* 
* @author Stephen Hardy @ spotpush.com
*/

public class ChildClass extends BaseClass {
    
    @Override
    public void doSomething(String str) {
        System.out.println("Child impl: "+str);
    }

    public static void main(String[] args) {
    
    }
}
