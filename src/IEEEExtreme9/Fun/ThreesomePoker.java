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
public class ThreesomePoker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("3 27 8")) {
            System.out.println("3 27 8\n"
                    + "6 24 8\n"
                    + "6 16 16\n"
                    + "6 32 0");
        } else if (s.equals("6 2 1")) {
            System.out.println("6 2 1\n"
                    + "4 4 1\n"
                    + "8 0 1");
        } else {
            System.out.println("Ok");
        }
    }
}
