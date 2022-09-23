package esinf;

public class Ex1 {

    /*
        1. Implement a recursive algorithm:
        a) That receives a string and returns another string with its characters in reverse order of the original string.*/

    public static String reverseString(String originalString) {
        // base case
        if (originalString.isEmpty())
            return originalString;
        //Calling Function Recursively
        return reverseString(originalString.substring(1)) + originalString.charAt(0);
    }

    /*
         b) To compute the product of two positive integers, m and n, using only the arithmetic operations:
          addition and subtraction.
    */
    public static Integer product(int m, int n) {

        if (m < n)
            return product(n, m);

            // m times sum of m
        else if (n != 0)
            return (m + product(m, n - 1));

            // if any of the two numbers is
            // zero return zero
        else return 0;

    }

    /*
    c) To calculate the greatest common divisor of two positive integers,
    for example m.d.c (48,30)=6, using the algorithm of successive divisions.
    */

    public static Integer mdc(int num1, int num2) {
        return num2 == 0 ? num1 : mdc(num2, num1 % num2);
    }




    public static void main(String[] args) {
        // System.out.println(reverseString("use the force"));
        //System.out.println(product(6,6));
        System.out.println(mdc(48, 30));

    }
}
