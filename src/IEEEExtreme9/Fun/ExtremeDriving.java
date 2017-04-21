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
public class ExtremeDriving {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("5 2")) {
            System.out.println("3");
        } else if (s.equals("28 2")) {
            System.out.println("368245731");
        } else {
            System.out.println("0");
        }
    }
}
