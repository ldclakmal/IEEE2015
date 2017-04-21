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
public class DigitFun1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        while (!s.equals("END")) {
            try {
                long n = Long.parseLong(s);
                if (n == 0) {
                    System.out.println("2");
                } else if (n == 1) {
                    System.out.println("1");
                } else if (n > 1 && n <= 9) {
                    System.out.println("2");
                } else if (n > 9 && n <= 999999999) {
                    System.out.println("3");
                } else {
                    System.out.println("4");
                }
                s = scan.nextLine();
            } catch (Exception e) {
                System.out.println("4");
            }
        }
    }
}
