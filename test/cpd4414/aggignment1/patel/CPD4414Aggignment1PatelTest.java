/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.aggignment1.patel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0664502
 */
public class CPD4414Aggignment1PatelTest {
    
    public CPD4414Aggignment1PatelTest() {
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
     * Test of stringPower method, of class CPD4414Aggignment1Patel.
     */
    @Test
    
    public void testEmptyStringShouldReturnEmptyString()
    {        
       System.out.println("testEmptyStringShouldReturnEmptyString");
        String str = "";
        int x = 9;
        String expResult = "";
        String result = CPD4414Aggignment1Patel.stringPower(str, x);
        assertEquals(expResult, result);
    }
    public void testLessThanOneShouldReturnNull()
    {        
       System.out.println("testLessThanOneShouldReturnNull");
        String str = "";
        int x = 0;
        String expResult = "";
        String result = CPD4414Aggignment1Patel.stringPower(str, x);
        assertEquals(expResult, result);
    }
    public void testStringAndOneShouldReturnString()
    {        
       System.out.println("testStringAndOneShouldReturnString");
        String str = "abcd";
        int x = 1;
        String expResult = "";
        String result = CPD4414Aggignment1Patel.stringPower(str, x);
        assertEquals(expResult, result);
    }
}
