/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEExtreme9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chanaka
 */
public class SnakesBunnies {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String board[][] = new String[n][n];
        for (int i = 0; i < n; i++) {
            board[i] = scan.nextLine().split("");
        }

//        printBoard(board, n);
        int p = scan.nextInt();
    }

    public static void printBoard(String[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static int move(String[][] board, int n, int x) {
        int xx = x / n;
        int yy = (xx % 2 == 0) ? ((x % n) - 1) : n - (x % n);
//        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//        Arrays.asList(yourArray).contains(yourValue)
        if (board[xx][yy].equals("-")) {
            return x;
        } else if (isNumeric(board[xx][yy])) {
            Arrays.asList(board).indexOf(board[xx][yy]);
        }
        return 0;
    }

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
