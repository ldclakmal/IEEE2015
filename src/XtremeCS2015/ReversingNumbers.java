/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XtremeCS2015;

import java.util.Scanner;

/**
 *
 * @author Chanaka
 */
public class ReversingNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        boolean flag = true;
        int count = 0;
        while (count < 10000000) {
            if (count - reverse(count) == q) {
                System.out.println(count);
                flag = false;
                break;
            }
            count++;
        }

        if (flag) {
            System.out.println("NONE");
        }
    }

    public static int reverse(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 * (int) Math.pow(10, (int) Math.log10((double) n)) + reverse(n / 10);
    }
}
