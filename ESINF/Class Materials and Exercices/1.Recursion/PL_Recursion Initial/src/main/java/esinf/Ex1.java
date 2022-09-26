package esinf;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex1 {

    /*
    1. Implement a recursive algorithm:
    a) That receives a string and returns another string with its characters in reverse order of the original string.
    */

    /**
     * @param originalString the string to be reversed
     * @return the reversed String
     */
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

    /**
     * @param m first element of the product
     * @param n second element of the product
     * @return the product of m * n
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

    /**
     * @param num1 first positive number
     * @param num2 second positive number
     * @return the greatest common divisor of the two numbers
     */
    public static Integer mdc(int num1, int num2) {
        return num2 == 0 ? num1 : mdc(num2, num1 % num2);
    }

    /*
    d) To convert a string of digits into the integer it represents.
    For example, “13531” represents the integer 13531.
    */

    /**
     * @param string containing the number that will be converted to int
     * @return an integer based on the content of the string
     */
    public static Integer stringToInt(String string) {

        // If the number represented as a string
        // contains only a single digit
        // then returns its value
        if (string.length() == 1)
            return (string.charAt(0) - '0');

        // Recursive call for the sub-string
        // starting at the second character
        double parcialConvertedInt = stringToInt(string.substring(1));

        // First digit of the number
        double convertedInt = string.charAt(0) - '0';

        // First digit multiplied by the
        // appropriate power of 10 and then
        // add the recursive result
        // For example, xy = ((x * 10) + y)
        convertedInt = convertedInt * Math.pow(10, string.length() - 1) + parcialConvertedInt;
        return (int) (convertedInt);
    }

    /*
    e) To see if a number is palindrome that is, the number is the same when written forwards or backwards
    (examples: 99, 101, 111, 121, 1221, 21112, 10001, … ).
    */

    public static Integer numPalindrome(int number, int numberConstructor) {
        if (number == 0) return numberConstructor;

        numberConstructor = numberConstructor * 10;
        numberConstructor += (number % 10);

        return numPalindrome(number / 10, numberConstructor);
    }


//    public static Integer lengthOfInt(int number) {
//        // returns the length of a given number
//        return (int) (Math.log10(number)) + 1;
//    }
//    public static Integer numPalindrome(int number) {
//
//        if (number % 10 == number) {
//            return number;
//        }
//
//        int last = number % 10;
//        int remaining = number / 10;
//        int lengthOfRemaing = lengthOfInt(remaining);
//        return last * (int)
//        Math.pow(10, lengthOfRemaing) + numPalindrome(remaining);
//    }


    /*
    f) To compute the sum of all the elements in an n × n (two-dimensional) array of integers.
    */

    public static Integer sumElementsArray(int[][] array, int row, int col) {

        // base case
        if (row == array.length - 1 && col == array[0].length -1)  return array[row][col];

        // recursive call
        if (col == array.length -1) {
            return array[row][col] + sumElementsArray(array, ++row, 0);
        }
        return array[row][col] + sumElementsArray(array, row, ++col);
    }



    public static void main(String[] args) {
//        System.out.println(reverseString("use the force"));
//        System.out.println(product(6, 6));
        System.out.println(mdc(48, 30));
//        System.out.println(stringToInt("123456789"));
//        System.out.println();

//        System.out.println(numPalindrome(101, 0));

//        int[][] array = {{1, 2}, {3, 4}};
//        System.out.println(sumElementsArray(array, 0, 0));


        try {
            List<String> list = whenReadSmallFileJava7_thenCorrect();
            List<Fruta> frutas = list.stream().map(s -> function(s)).toList();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

    static  Fruta function(String line) {
        // fazer o split da linha por virgulas
        line.split(",");
        Fruta fruta = new Fruta();
        fruta.setArea("afganistao");
        fruta.setItem("apples");
        fruta.setYear("1961");
        fruta.setValue("151000");
        return fruta;
    }
    public static List<String> whenReadSmallFileJava7_thenCorrect()
            throws IOException {
        String expected_value = "Hello, world!";

        Path path = Paths.get("C:\\Users\\fmarquescouto-admin\\Desktop\\2022-ISEP\\ESINF\\Sprint 1\\FAOSTAT_data_en_9-7-2022_BIG.csv");

        List<String> read = Files.readAllLines(path);
        return read;
    }


}
