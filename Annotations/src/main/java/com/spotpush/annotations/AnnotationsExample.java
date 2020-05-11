package com.spotpush.annotations;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
* Implement Java Annotations
* @author Stephen Hardy @ spotpush.com
*/

public class AnnotationsExample {

    
    /**
     * Override the known method toString()
     * @return 
     */
    @Override
    public String toString() {
        return "Override toString method";
    }
    
    /**
     * Deprecate vs delete
     * If the method is only used internally (company) then delete
     * IF used by a public facing API deprecate then remove
     * Method is still usable but may be better server elsewhere
     * @deprecated
     */
    @Deprecated
    public static void oldMethod() {
        System.out.println("old method, don't use");
    }
    
    //This is good practice when documenting deprecated methods
    @Deprecated
    /**
     * @deprecated use alternativeMethod() instead
     */
    public static void myComponent() {
        System.out.println("Deprecated, use alternativeMethod()");
    }
    
    /**
     * Suppress the warning of deprecation ignores the fact that
     * oldMethod() is deprecated.  It's an acknowledgement that you know
     * this method is best avoided but are using it anyway
     * @throws FileNotFoundException 
     */
    @SuppressWarnings({"unchecked","deprecation"})
    public static void genericsTest() throws FileNotFoundException {
        List l = new ArrayList();
        l.add("abc");
        oldMethod();
    }
    
    /**
     * Functional Interfaces must contain only one abstract method
     * the @FuhnctionalInterface ensures the interface only implements one abstract
     * method and throws a compile error if it doesn't
     * @param <F>
     * @param <T> 
     */
    @FunctionalInterface
    interface Converter<F,T>{
        T convert(F from);
        //Z convertZ(Z from); uncomment this method @FunctionalInterface will
        //error 
    }
       
    
    /**
     * Variable Arguments (varargs) variable number of arguments into a method
     * Not actually safe
     * 
     */
    @SafeVarargs 
    static void variableArguments(String ...abc) {
        
    }
    
    //@Retention
    //@Target
    //@Inherited
    //@Documented
    
    
    
    
    
    public static void main(String[] args) {
    
        /**
         * Calling @FunctionalInterface Converter
         */
        Converter<String,Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);
    }
}
