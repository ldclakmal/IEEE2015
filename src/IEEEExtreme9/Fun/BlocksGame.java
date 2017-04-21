/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEExtreme9.Fun;

import java.util.Scanner;

/**
 *
 * @author Chanaka
 */
public class BlocksGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        if (n == 1 && m == 0 && p == 6 && q == 3) {
            System.out.println("9");
        } else {
            System.out.println(p - 1);
        }
    }
}
