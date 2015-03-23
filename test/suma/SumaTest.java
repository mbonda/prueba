/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcelo1
 */
public class SumaTest {
    
    public SumaTest() {
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

    /**
     * Test of sumar method, of class Suma.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        Suma instance = new Suma(2,3);
        int expResult = 5;
        int result = instance.sumar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
}