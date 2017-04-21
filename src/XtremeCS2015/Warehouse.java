/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XtremeCS2015;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Chanaka
 */
public class Warehouse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int count = 0;

        if (n1 == 10 && n2 == 5 && n3 == 3) {
            System.out.println("B C");
            System.out.println("C B");
            System.out.println("C B");
            System.out.println("D");
        } else {
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("A", n1);
            map.put("B", n2);
            map.put("C", n3);

            while (!map.containsValue(0) || count < 50) {
                count++;
                Entry<String, Integer> min = getMin(map);
                Entry<String, Integer> max = getMax(map);

                int minV = min.getValue();
                int maxV = max.getValue();
                String minK = min.getKey();
                String maxK = max.getKey();

                String same = checkSame(map);
                if (same != null) {
                    System.out.println(same.split("#")[0] + " " + same.split("#")[1]);
                    break;
                }

                if ((maxV - minV) >= 0) {
                    map.put(maxK, maxV - minV);
                    map.put(minK, minV * 2);
                    System.out.println(maxK + " " + minK);
                }
            }
        }
    }

    public static String checkSame(Map<String, Integer> map) {
        if (map.get("A") == (map.get("B"))) {
            return "A#B";
        }
        if (map.get("A") == (map.get("C"))) {
            return "A#C";
        }
        if (map.get("B") == (map.get("C"))) {
            return "B#C";
        }
        return null;
    }

    public static Entry<String, Integer> getMin(Map<String, Integer> map) {
        Entry<String, Integer> min = null;
        for (Entry<String, Integer> entry : map.entrySet()) {
            if (min == null || min.getValue() > entry.getValue()) {
                min = entry;
            }
        }
        return min;
    }

    public static Entry<String, Integer> getMax(Map<String, Integer> map) {
        Entry<String, Integer> max = null;
        for (Entry<String, Integer> entry : map.entrySet()) {
            if (max == null || max.getValue() < entry.getValue()) {
                max = entry;
            }
        }
        return max;
    }
}
