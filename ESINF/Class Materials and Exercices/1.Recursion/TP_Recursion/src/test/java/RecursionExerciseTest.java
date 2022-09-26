/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import esinf.RecursionExercise;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 */
public class RecursionExerciseTest {
    
    public RecursionExerciseTest() {
    }

    /**
     * Test of sum method, of class RecursionExercices.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int m = 10;
        int n = 20;
        int expResult = m+n;
        int result = RecursionExercise.sum(m, n);
        assertEquals(expResult, result);
        
        m = 0;
        n = 20;
        expResult = m+n;
        result = RecursionExercise.sum(m, n);
        assertEquals(expResult, result);        
    }

    /**
     * Test of decimalToBinary method, of class RecursionExercices.
     */
    @Test
    public void testDecimalToBinary() {
        System.out.println("decimalToBinary");
        Integer d = 6;
        String expResult = "110";
        String result = RecursionExercise.decimalToBinary(d);
        assertEquals(expResult, result);
        
        d = 29;
        expResult = "11101";
        result = RecursionExercise.decimalToBinary(d);
        assertEquals(expResult, result);        
    }

    /**
     * Test of isPrime method, of class RecursionExercices.
     */
    @Test
    public void testIsPrime() {
        System.out.println("isPrime");
        int d = 71;
        boolean expResult = true;
        boolean result = RecursionExercise.isPrime(d);
        assertEquals(expResult, result);
        
        d = 75;
        expResult = false;
        result = RecursionExercise.isPrime(d);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPalindrome method, of class RecursionExercices.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        String word = "SOPAPOS";
        boolean expResult = true;
        boolean result = RecursionExercise.isPalindrome(word);
        assertEquals(expResult, result);
        
        word = "POSSOS";
        expResult = false;
        result = RecursionExercise.isPalindrome(word);
        assertEquals(expResult, result);        
    }
    
}
