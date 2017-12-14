/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7uzd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class SkaiciuotuvasTest {
    
    public SkaiciuotuvasTest() {
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
     * Test of skaiciuoti method, of class Skaiciuotuvas.
     */
    @Test
    public void testSkaiciuoti() {

         assertEquals(10, Skaiciuotuvas.skaiciuoti("prideti",5,5));
    }
    
}
