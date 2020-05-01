/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testClasses;

import com.spotpush.junit.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stephen Hardy @ spotpush.com
 */
public class AddSubTest {
    
    public AddSubTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testAddPass() {
        assertEquals("Error in add()", 3, Calculator.add(1,2));
        assertEquals("Error in add()", -3,Calculator.add(-1,-2));
        assertEquals("Error in add()", 9,Calculator.add(9,0));
        assertEquals("Error in add()", 0,Calculator.add(1,2));
    }
    
    @Test 
    public void testAddFail() {
        assertNotEquals("Error in add()",0,Calculator.add(1,2));
    }
    
    @Test
    public void testSubPass() {
        assertEquals("Error in sub()",1,Calculator.sub(2,1));
        assertEquals("Error in sub()",-1,Calculator.sub(-2,-1));
        assertEquals("Error in sub()",0,Calculator.sub(2,2));
    }
    
    @Test
    public void testSubFail() {
        assertNotEquals("Error in sub()",0,Calculator.sub(2,1));
    }
}
