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
public class restaTest {
    
    public restaTest() {
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
     * Test of restar method, of class resta.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        resta instance = new resta(2,3);
        int expResult = -1;
        int result = instance.restar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}