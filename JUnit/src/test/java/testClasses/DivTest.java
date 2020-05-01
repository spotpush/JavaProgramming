package testClasses;
/**
 *
 * @author Stephen Hardy @ spotpush.com
 */
import com.spotpush.junit.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivTest {
    
    @Test
    public void testDivIntPass() {
        assertEquals("Error in divInt()",3,Calculator.divInt(9,3));
        assertEquals("Error in divInt()",0,Calculator.divInt(1,9));
    }
    
    @Test
    public void testDivIntFail() {
        assertNotEquals("Error in divInt()",1,Calculator.divInt(9,3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivIntByZero() {
        Calculator.divInt(9,0);
    }
    
    @Test
    public void testDivRealPass() {
        assertEquals("Error in divInt()",0.333333,Calculator.divReal(1,3),1e-6);
        assertEquals("Error in divInt()",0.111111,Calculator.divReal(1,9),1e-6);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivRealByZero() {
        Calculator.divReal(9,0);
    }
    
    
    public DivTest() {
    }
    
}
