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
public class GameofThronesI {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String in = myScan.nextLine();

        String ans;
        if (in.length() == 1) {
            ans = "YES";
        }
        int[] letters = new int[26];
        for (int i = 0; i < in.length(); i++) {
            System.out.println(in.charAt(i) - 'a');
            letters[in.charAt(i) - 'a']++;
        }
        int odd = 0;
        for (int l : letters) {
            if (l % 2 != 0) {
                odd++;
            }
        }
        ans = (odd > 1) ? "NO" : "YES";
        System.out.println(ans);
        myScan.close();
    }
}
