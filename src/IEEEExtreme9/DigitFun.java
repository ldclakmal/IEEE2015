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
public class DigitFun {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        while (!s.equals("END")) {
            long count = 1;
            long n = Long.parseLong(s);
            long x = String.valueOf(n).length();
            while (x != n) {
                n = x;
                x = String.valueOf(x).length();
                count++;
            }
            System.out.println(count);
            s = scan.nextLine();
        }
    }
}
