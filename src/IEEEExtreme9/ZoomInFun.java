/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEExtreme9;

import java.util.Scanner;

/**
 *
 * @author Chanaka
 */
public class ZoomInFun {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int col = scan.nextInt();
        int row = scan.nextInt();
        int cha = scan.nextInt();
        scan.nextLine();

        String in[][] = new String[row][cha];

        for (int i = 0; i < cha; i++) {
            String s = scan.nextLine();
            for (int j = 0; j < row; j++) {
                in[j][i] = scan.nextLine();
            }
        }

        int out[][] = new int[row][col * cha];

        int x = scan.nextInt();
        String ss = scan.nextLine();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cha; j++) {
                System.out.print(in[i][j]);
            }
            System.out.println();
        }
    }
}
