/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEExtreme9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chanaka
 */
public class Pattern3 {
    // return the longest common prefix of s and t

    public static String lcp(String s, String t) {
        int n = Math.min(s.length(), t.length());
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return s.substring(0, i);
            }
        }
//        System.out.println("lcp : "+s.substring(0, n));
        return s.substring(0, n);
    }

    // return the longest repeated string in s
    public static String lrs(String s) {

        // form the N suffixes
        int N = s.length();
        String[] suffixes = new String[N];
        for (int i = 0; i < N; i++) {
            suffixes[i] = s.substring(i, N);
        }

        // sort them
        Arrays.sort(suffixes);

        // find longest repeated substring by comparing adjacent sorted suffixes
        String lrs = "";
        for (int i = 0; i < N - 1; i++) {
            String x = lcp(suffixes[i], suffixes[i + 1]);
            if (x.length() > lrs.length()) {
                lrs = x;
            }
        }
//        System.out.println("lrs : " +lrs);
        return lrs;
    }

    // read in text, replacing all consecutive whitespace with a single space
    // then compute longest repeated substring
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < t; i++) {
            String s = scan.nextLine();
//            System.out.println(lrs(s));
            long length = lrs(s).length();
            if (length == 0) {
                length = s.length();
            }
            System.out.println(length);
        }
    }
}
