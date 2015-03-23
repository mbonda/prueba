/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import suma.Suma;
/**
 *
 * @author Marcelo1
 */
public class NewEmptyJUnitTest {
    
     public void testsumaPositivos() {
	      System.out.println("Sumando dos números positivos ...");
	       Suma S = new Suma(2,3);
	       assertTrue(S.sumar() == 5);
	   }
    public NewEmptyJUnitTest() {
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
}