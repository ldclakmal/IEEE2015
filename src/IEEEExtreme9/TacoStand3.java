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
public class TacoStand3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        scan.nextLine();
        while (N != 0) {
            String ss[] = scan.nextLine().split(" ");
            long s = Long.parseLong(ss[0]);
            long m = Long.parseLong(ss[1]);
            long r = Long.parseLong(ss[2]);
            long b = Long.parseLong(ss[3]);
            long min = getMin(m, r, b);
            long max = getMax(m, r, b);
            long mid = getMid(m, r, b);

            long temp = 0;
            if (min + mid <= max) {
                temp = min + mid;
            } else {
                temp = max;
            }

            if (s < temp) {
                System.out.println(s);
            } else {
                System.out.println(temp);
            }

            N--;
        }
    }

    public static long getMin(long a, long b, long c) {
        return Math.min(Math.min(a, b), c);
    }

    public static long getMax(long a, long b, long c) {
        return Math.max(Math.max(a, b), c);
    }

    public static long getMid(long a, long b, long c) {
        return Math.max(Math.min(a, b), Math.min(Math.max(a, b), c));
    }
}
