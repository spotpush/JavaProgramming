package com.spotpush.methods;


/**
 * Abstract methods are methods without bodies (no implementation), just signatures
 * If a class has an abstract method then it should be declared abstract
 * 
 * @author Stephen Hardy @ spotpush.com 
 */
abstract class MultipleNumbers {
    
    /**
     * This is an abstract method.  Child classes must implement this method
     * @param x1
     * @param x2
     * @param x3
     * @return 
     */
    public abstract int sumOfThree(int x1, int x2, int x3);
}
        
/**
 * Regular class (AbstractMethods) extends abstract class 
 * @author Stephen Hardy @ spotpush.com
 */
public class AbstractMethods extends MultipleNumbers {
      
    /**
     * Each method of the abstract class (MultipleNumbers) needs to be implemented
     * otherwise the program will throw a compile error
     * @param x1
     * @param x2
     * @param x3
     * @return 
     */
    @Override
    public int sumOfThree(int x1, int x2, int x3) {
        return x1+x2+x3;
    }
    
    
    public static void main(String[] args) {
    
    }
}
