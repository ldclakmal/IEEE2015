/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XtremeCS2015;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chanaka
 */
public class HungerGames {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int arr[] = new int[size];

//        Arrays.fill(arr, 1);

        boolean flag = false;
        int index = 0;
        do {
            flag = false;
            for (int i = 0, j = 0; i < size; i++) {
                if (arr[i] != -1) {
                    if (isSquare(j + 1)) {
                        arr[i] = -1;
                    } else {
                        flag = true;
                        index = i + 1;
                    }
                    j++;
                }
            }
        } while (flag);

        System.out.println(index);
    }

    public static boolean isSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        if (sqrt * sqrt == number) {
            return true;
        }
        return false;
    }
}
