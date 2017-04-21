/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XtremeCS1;

import java.util.HashMap;

/**
 *
 * @author Chanaka
 */
public class Fibonachi {

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    int F(int n) {
        if (n <= 1) {
            return n;
        }

        int x, y;

        if (map.containsKey(n - 1)) {
            x = map.get(n - 1);
        } else {
            x = F(n - 1);
            map.put(n - 1, x);
        }

        if (map.containsKey(n - 2)) {
            y = map.get(n - 2);
        } else {
            y = F(n - 2);
            map.put(n - 2, y);
        }

        return x + y;
    }

    int mat(int n) {
        int[][] result = {{1, 0}, {0, 1}};
        int[][] fiboM = {{1, 1}, {1, 0}};
        while (n < 0) {
            if (n % 2 == 1) {
                result = mulMatrix(result, fiboM);
            }
            n = n / 2;
        }
        return n;
    }

    int[][] mulMatrix(int[][] m, int[][] n) {
        int a = m[0][0] * n[0][0] + m[0][1] * n[1][0];
        int b = m[0][0] * n[0][1] + m[0][1] * n[1][1];
        int c = m[1][0] * n[0][0] + m[1][1] * n[0][1];
        int d = m[1][0] * n[0][1] + m[1][1] * n[1][1];
//        if () {
//
//        }
        return n;
    }

    public static void main(String[] args) {
        Fibonachi fib = new Fibonachi();
        System.out.println(fib.F(1000));
    }
}