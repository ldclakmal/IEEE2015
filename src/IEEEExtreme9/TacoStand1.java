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
public class TacoStand1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        while (N != 0) {
            long s = scan.nextLong();
            long m = scan.nextLong();
            long r = scan.nextLong();
            long b = scan.nextLong();
            long min = getMin(m, b);
            long max = getMax(m, b);

            long plates = 0;
            long temp = 0;
            if (r > min) {
                plates = min;
                temp = r - min;
                if (temp > max) {
                    plates += max;
                } else {
                    plates += temp;
                }
            } else {
                plates = r;
            }

            if (s < plates) {
                System.out.println(s);
            } else {
                System.out.println(plates);
            }
            N--;
        }
    }

    public static long getMin(long a, long b) {
        return Math.min(a, b);
    }

    public static long getMax(long a, long b) {
        return Math.max(a, b);
    }
}
