/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinf;

/**
 *
 * @author nunotmalheiro
 */
public class Labirinth {

    /**
     * @param actual the labirinth in its actual (marked) form
     * @param y      coordinate y in the labirinth
     * @param x      coordinate x in the labirinth
     * @return the marked labirinth or null if there is no way
     */
    public static int[][] check(int[][] actual, int y, int x) {

        boolean b_check = false;

        // base case
        actual[y][x] = 9;
        if (y == 6 && x == 12) {
            return actual;
        }
        if(actual[6][12]==9){
            b_check=true;
        }

        // recursion
        // north
        // check if move is valid

        // if move is valid the call function
        if (validMove(actual, y - 1, x)) {
            actual = check(actual, y - 1, x);
            if(actual[6][12]==9){
                return actual;
            }
        }

        // east
        if (validMove(actual, y, x + 1)) {
            actual = check(actual, y, x + 1);
            if(actual[6][12]==9){
                return actual;
            }
        }

        // south
        if (validMove(actual, y + 1, x)) {
            actual = check(actual, y + 1, x);
            if(actual[6][12]==9){
                return actual;
            }
        }


        // west
        if (validMove(actual, y, x - 1)) {
            actual = check(actual, y, x - 1);
            if(actual[6][12]==9){
                return actual;
            }
        }

        actual[y][x] = 2;

        // if you are back to the bgining and the final postition is not reacheble
        if(x==0 && y==0 && actual[6][12] != 9){
            return null;
        }

        return actual;


    }

    private static boolean validMove(int[][] map, int y, int x) {

        // validate if we are inside the matrix
        if (map.length <= y|| y < 0 || map[0].length <= x || x < 0) {
            return false;
        }
        if(map[y][x] != 0 && map[y][x] != 2 && map[y][x] != 9){
            return true;
        }
        return false;
    }
}
