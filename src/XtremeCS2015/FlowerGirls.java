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
public class FlowerGirls {

    static int j,o;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = Integer.parseInt(scan.nextLine());
        String line[] = scan.nextLine().split("");

        Vector J = new Vector();
        Vector O = new Vector();

        for (int i = 1; i <= q; i++) {
            if (J.isEmpty()) {
                J.add(line[i]);
            } else if (!J.contains(line[i])) {
                J.add(line[i]);
            } else if (O.isEmpty()) {
                O.add(line[i]);
            } else if (!O.contains(line[i])) {
                O.add(line[i]);
            } else{
                O.add(line[i]);
            }
        }
        
        print(J);
        print(O);
    }

    public static void print(Vector v) {
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i));
        }
        System.out.println("");
    }
    
    public static void calc(Vector v, String name){
        if(name=="J"){
            for (int i = 0; i < v.size(); i++) {
//                v.get(i).
            }
        }else{
            
        }
    }
}
