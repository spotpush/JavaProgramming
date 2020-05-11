package com.spotpush.annotations.overriding;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class OverrideTest {

    public static void main(String[] args) {
    
        BaseClass bc = new ChildClass();
        bc.doSomething("Override");
    }
}
