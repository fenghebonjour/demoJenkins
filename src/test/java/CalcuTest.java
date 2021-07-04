/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fengh
 */
public class CalcuTest {
    
    public CalcuTest() {
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
     * Test of add method, of class Calcu.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 5;
        int b = 3;
        Calcu instance = new Calcu();
        int expResult = 8;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }
    
}
