/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoratest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oquintansocampo
 */
public class MainTest {

    public MainTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of realizaOperacion method, of class Main.
     */
    @Test
    public void testRealizaOperacion() {
        System.out.println("realizaOperacion");
        float n1 = 1.0F;
        float n2 = 3.0F;
        String op = "sumar";
        float expResult = 4.0F;
        float result = Main.realizaOperacion(n1, n2, op);
        assertEquals(expResult, result, 0.0);

    }

}
