/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEXtremePracticeCommunity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chanaka
 */
public class MagicSquare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int arr[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int diSum = 0;
        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            diSum += arr[i][i];
        }

        for (int i = 0; i < N; i++) {
            sum += arr[i][N - i - 1];
        }
        if (sum != diSum) {
            list.add(0);
        }
        sum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sum += arr[j][i];
            }
            if (sum != diSum) {
                list.add((i + 1) * -1);
            }
            sum = 0;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sum += arr[i][j];
            }
            if (sum != diSum) {
                list.add(i + 1);
            }
            sum = 0;
        }

        System.out.println(list.size());
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
