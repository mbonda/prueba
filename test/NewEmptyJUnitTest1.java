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
import suma.resta;
/**
 *
 * @author Marcelo1
 */
public class NewEmptyJUnitTest1 {
    
    
     public void testrestaPositivos() {
	      System.out.println("Sumando dos n�meros positivos ...");
	       resta S = new resta(2,3);
	       assertTrue(S.restar() == -1);
	   }

	   @Test
	   public void testrestaNegativos() {
	       System.out.println("Sumando dos n�meros negativos ...");
	       resta S = new resta(-2,-3);
	       assertTrue(S.restar() == 1);
	   }

	   @Test
	   public void testrestaPositivoNegativo() {
	       System.out.println("Sumando un n�mero positivo y un n�mero negativo ...");
	       resta S = new resta(2,-3);
	       assertTrue(S.restar() == 5);
	   }
    public NewEmptyJUnitTest1() {
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