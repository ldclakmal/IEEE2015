/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEExtreme9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chanaka
 */
public class LightGremlins {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < t; i++) {
            String s[] = scan.nextLine().split(" ");
            long sw = Long.parseLong((s[0]));
//            ArrayList<Boolean> swArr = new ArrayList<Boolean>();
            boolean swArr[] = new boolean[(int) sw];
            int n = Integer.parseInt(s[1]);
            long arr[] = new long[n];
            for (int j = 0; j < s.length - 2; j++) {
                arr[j] = Long.parseLong(s[j + 2]);
            }

            for (int j = 0; j < n; j++) {
                long mul = arr[j];
                long temp = arr[j];
                while (mul <= sw) {
//                    swArr.set((int) mul - 1, swArr.get((int) mul - 1)==true ? false : true);
                    (swArr[(int) mul - 1]) = (swArr[(int) mul - 1]) ? false : true;
                    mul += temp;
                }
            }
            int count = 0;
            for (long j = 0; j < sw; j++) {
                if (swArr[(int) j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
