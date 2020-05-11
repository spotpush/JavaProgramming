/* Javadoc file stored at root \target\site\apidocs */
package com.spotpush.javadoc;

import java.io.IOException;


/**
* JavaDocExample is an example class for creating a Javadoc
* This block represents a class-level javadoc
* 
* Please see the (@link www.spotpush.com) class for true identity
* @author Stephen Hardy @ spotpush.com
*/

public class JavaDocExample {
    
    /**
     * Field-level Comment
     */
    private String JDExample;
       
    
    /**
     * <p>Method level JavaDoc</p>
     * @param val pass age to method
     * @return 10 double digit age
     * @throws java.io.IOException Check for file
     * @see <a href="http://www.spotpush.com">Spotpush.com</a>
     * @since 1.0
     * @version 2.0
     * @deprecated method javaDocMethod not longer relevant  
     */
    
    public int javaDocMethod(int val) throws IOException {
        return 10;
    }
        
    /**
     * <p>This is the main method executed when the program starts</p>
     * @param args Standard args classification for main method
     */
    public static void main(String[] args) {
    
    }
}
