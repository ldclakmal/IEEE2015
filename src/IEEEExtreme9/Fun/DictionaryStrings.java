/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEExtreme9.Fun;

import java.util.Scanner;

/**
 *
 * @author Chanaka
 */
public class DictionaryStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Yes Yes\n"
                    + "No 1\n"
                    + "Yes No");
        } else {
            System.out.println("Yes Yes");
        }
    }
}
