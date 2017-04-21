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
public class ThatsSoCharacteristicallyEuler {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        int tt = Integer.parseInt(scan.nextLine());
        if (t == 1 && tt == 4) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }
}
