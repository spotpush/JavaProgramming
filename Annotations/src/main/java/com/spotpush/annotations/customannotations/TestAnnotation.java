package com.spotpush.annotations.customannotations;

import com.spotpush.annotations.customannotations.TesterInfo.Priority;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

@TesterInfo(
    priority = Priority.HIGH,
    createdBy = "spotpush.com",
    tags = {"sales","test"}
)
public class TestAnnotation {

    @Test
    void testA() {
        if (true)
            throw new RuntimeException("This test always failed");
    }
    
    @Test(enabled=false)
    void testB() {
        if(false)
            throw new RuntimeException("This test always passed");
    }
    
    @Test(enabled=true)
    void testC() {
        if (10>1) {
            //do nothing, this test always passes.
        }
    }
       
}
