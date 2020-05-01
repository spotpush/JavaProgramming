package myNumber;
/**
 *
 * @author Stephen Hardy @ spotpush.com
 */
import com.spotpush.junit.MyNumber;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class MyNumberTest {
    
    private MyNumber number1,number2; // Test fixtures
    
    @Before
    public void setUp() {
        System.out.println("Run @Before");
        number1 = new MyNumber(11);
        number2 = new MyNumber(22);
    }
    
    @After
    public void tearDown() {
        System.out.println("Run @After");
    }
    
    @Test
    public void testGetterSetter() {
        System.out.println("Run @Test testGetterSetter"); // for illustration
        int value = 33;
        number1.setNumber(value);
        assertEquals("Error in getter/setter",value, number1.getNumber());
    }
    
    @Test
    public void testAdd() {
        System.out.println("Run @Test testAdd"); // for illustration
        assertEquals("Error in add()",33,number1.add(number2).getNumber());
        assertEquals("Error in add()",55,number1.add(number2).getNumber());
    }
    
    @Test
    public void testDiv() {
        System.out.println("Run @Test testDiv"); // for illustration
        assertEquals("error in div()", 2, number2.div(number1).getNumber());
        assertEquals("error in div()", 0, number2.div(number1).getNumber());
   }
 
   @Test(expected = IllegalArgumentException.class)
    public void testDivByZero() {
        System.out.println("Run @Test testDivByZero"); // for illustration
        number2.setNumber(0);
        number1.div(number2);
   }
    
    
    public MyNumberTest() {
    }
    
}
