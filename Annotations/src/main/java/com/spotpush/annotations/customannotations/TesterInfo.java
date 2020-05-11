package com.spotpush.annotations.customannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TesterInfo {

    public enum Priority {
        LOW,MEDIUM,HIGH
    }
    
    Priority priority() default Priority.MEDIUM;
    
    String[] tags() default "";
    
    String createdBy() default "spotpush.com";
    
    String lastModified() default "07/05/2020";
    
}
