/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XtremeCS2015;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Chanaka
 */
public class MadhawisBabies {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        Vector v = new Vector();
        for (int i = 1; i <= N; i++) {
            v.add(i);
        }

        double round = 0;
        String value = null;
        int x = 0;
        double t = 0;

        while (!v.isEmpty()) {
            t = Math.pow(round + 1, 3);
            x = (int) t + x - 1;
            x %= v.size();
            if (x <= 0) {
                x = v.size();
            }
            value = v.get(x - 1).toString();
            v.remove(x - 1);
            round++;
        }

        System.out.println(Integer.parseInt(value) + 1);
    }
}
