package com.spotpush.annotations.customannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* This @interface tell java that this is a custom annotation
* It can be annotated on a method like: @Test(enable=false)
* Method declarations where @Test is annotated must not have any parameters
* or a throws clause.  Return types are restricted to primitive data types 
* (byte, short, int, long, float, double, boolean, char)
* 
* @author Stephen Hardy @ spotpush.com
*/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
    
    public boolean enabled() default true;

    
}
