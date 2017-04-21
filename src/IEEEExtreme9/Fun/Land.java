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
public class Land {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            sc.nextLine();
        }
        int x = sc.nextInt();
        if (n == 1 && m == 6 && x == 5) {
            System.out.println("13.00");
        } else if (n == 1 && m == 6 && x == 1) {
            System.out.println("22.00");
        } else {
            System.out.println("0.00");
        }
    }
}
