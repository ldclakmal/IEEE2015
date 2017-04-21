/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEExtreme9;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Chanaka
 */
public class ZoomIn {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int col = scan.nextInt();
        int row = scan.nextInt();
        int cha = scan.nextInt();
        scan.nextLine();

        String s[] = new String[cha];
        String in[] = new String[row * cha];

        for (int i = 0; i < cha; i++) {
            s[i] = scan.nextLine();
            for (int j = 0; j < row; j++) {
                String temp = scan.nextLine();
//                if (temp.equals("")) {
//                    for (int k = 0; k < col; k++) {
//                        temp += " ";
//                    }
//                }
                in[j + i * row] = temp;
            }
        }

        int x = scan.nextInt();
        scan.nextLine();
        Vector<String> vScan = new Vector<String>();
        Vector<Vector<Integer>> vv = new Vector<Vector<Integer>>();

        for (int i = 0; i < x; i++) {
            String sf = scan.nextLine();
            vScan.add(sf);
            Vector<Integer> vIndex = new Vector<Integer>();
            for (int j = 0; j < sf.length(); j++) {
                if (sf.equals(" ") || sf.equals("")) {
                    vIndex.add(-1);
                } else {
                    vIndex.add(Arrays.asList(s).indexOf(String.valueOf(sf.charAt(j))));
                }
            }
            vv.add(vIndex);
        }

        for (int p = 0; p < x; p++) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < vScan.get(p).length(); j++) {
                    int k = vv.get(p).get(j);
                    if (k == -1) {
                        System.out.print("");
                    } else {
                        System.out.print(in[(k * cha) + k + i]);
                    }
                }
                System.out.println();
            }
        }
    }
}
