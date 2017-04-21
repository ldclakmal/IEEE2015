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
public class CarSpark {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < T; i++) {
            int N = scan.nextInt();
            scan.nextLine();
            int arr[][] = new int[N][4];
            for (int j = 0; j < N; j++) {
                arr[j][0] = scan.nextInt();
                arr[j][1] = scan.nextInt();
                arr[j][2] = scan.nextInt();
                arr[j][3] = arr[j][2] / (arr[j][1] - arr[j][0]);
            }

//            System.out.println("-----------------------------------------------");
//
//            for (int j = 0; j < N; j++) {
//                System.out.print(arr[j][0] + " ");
//                System.out.print(arr[j][1] + " ");
//                System.out.print(arr[j][2] + " ");
//                System.out.print(arr[j][3] + " ");
//                System.out.println();
//            }

            int pay = 0;

            for (int j = 0; j < N; j++) {
                pay += arr[j][2];
            }

            System.out.println(pay);
        }
    }
}
