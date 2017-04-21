/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XtremeCS2015;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author Chanaka
 */
public class TunaString {

    public static int getDuplicateCount(String[] arr, String a) {
        int count = 0;
        Vector v = new Vector();
        for (int i = 0; i < arr.length; i++) {
            if (v.contains(arr[i])) {
                if (a.equals(arr[i] + arr[i])) {
                    count++;
                }
            } else {
                v.add(arr[i]);
            }
        }
        return count;
    }

    static String answer = "";

    public static void printCombinations(String initial, String combined) {
        answer = answer + combined + " ";
        for (int i = 0; i < initial.length(); i++) {
            printCombinations(initial.substring(i + 1), combined + initial.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] testcase = new String[N];
        for (int i = 0; i < N; i++) {
            testcase[i] = scan.next();
        }

        for (int m = 0; m < testcase.length; m++) {
            printCombinations(testcase[m], "");

            String[] arr = answer.split(" ");

            int tot = 0;
            for (int i = 0; i < arr.length; i++) {

                if (arr[i].length() > 1) {
                    printCombinations(arr[i], "");
                    int count = getDuplicateCount(arr, arr[i]);
                    if (count >= 1) {
                        tot++;
                    }
                }
                answer = "";
            }
            System.out.println(tot);
            answer = "";
        }
    }
}
