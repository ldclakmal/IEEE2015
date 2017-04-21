/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEXtremePracticeCommunity;

import java.util.Scanner;

/**
 *
 * @author Chanaka
 */
public class SumItUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        int X = scan.nextInt();
        for (int i = 0; i < X; i++) {
            scan.nextInt();
        }

        long sum = 0;

        for (int j = 0; j < N; j++) {
            sum += arr[j];
        }

        for (int i = 0; i < X; i++) {
            sum *= 2;
            sum = (long) (sum % (Math.pow(10, 9) + 7));
        }
        System.out.println((long) (sum % (Math.pow(10, 9) + 7)));
    }
}
