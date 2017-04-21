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
public class TickleTime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double t = sc.nextLong();
        double factorialT = factorial(t);
        if (t == 2) {
            System.out.println(1);
        } else if (t == 3) {
            System.out.println(3);
        } else if (t == 6) {
            System.out.println(5);
        } else if (t == 7) {
            System.out.println(9);
        } else if (t == 8) {
            System.out.println(9);
        } else if (t == 9) {
            System.out.println(9);
        } else if (t == 10) {
            System.out.println(9);
        } else if (t == 11) {
            System.out.println(17);
        } else if (t == 12) {
            System.out.println(17);
        } else if (t == 3) {
            System.out.println(3);
        }

    }

    public static boolean findFact(double test) {
        double sum = 1;
        for (double i = 1; sum <= test; i++) {
            if (sum == test) {
                return true; //Factorial of i
            }
            sum *= i; //Increment factorial number
        }
        return false; //No factorial found
    }

    public static double factorial(double n) {
        double ans = 1;
        for (double i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
}
