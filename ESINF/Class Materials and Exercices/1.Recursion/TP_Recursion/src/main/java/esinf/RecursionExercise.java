/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinf;

import org.w3c.dom.ls.LSOutput;

/**
 *
 */
public class RecursionExercise {
    
    /**
     *
     * @param m first integer
     * @param n second integer
     * @return the sum of the two parcels
     */
    public static int sum(int m, int n) {
        //base case
        if (m == 0 ) return n;

        // recursive call
        return sum(m - 1, n + 1);
    }
    
    /**
     *
     * @param d number in decimal base
     * @return the number converted to binary base
     */
    public static String decimalToBinary(Integer d) {
        if (d.toString().equals(0))
            return "0";

        else

        return "";
    }
    
    /**
     *
     * @param d number to check
     * @return true if the number is a prime, false otherwise
     */
    public static boolean isPrime(int d) {
        
        return isPrime(d,2);
    }

    private static boolean isPrime(int d, int i) {
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     *
     * @param word word to check
     * @return true if the word is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String word) {
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
