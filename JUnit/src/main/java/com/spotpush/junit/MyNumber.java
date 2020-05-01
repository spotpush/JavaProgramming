package com.spotpush.junit;
/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class MyNumber {

    int number;
    
    //constructor no param
    public MyNumber() {
        this.number = 0;
    }
    
    //constructor with param
    public MyNumber(int number) {
        this.number = number;
    }

    //getter
    public int getNumber() {
        return number;
    }

    //setter
    public void setNumber(int number) {
        this.number = number;
    }
    
    //public methods
    public MyNumber add(MyNumber rhs) {
        this.number += rhs.number;
        return this;
    }
    
    public MyNumber div(MyNumber rhs) {
        if(rhs.number == 0) throw new IllegalArgumentException("Can't divide by 0");
        this.number /= rhs.number;
        return this;
    }
    
    
    
    public static void main(String[] args) {
    
    }
}
