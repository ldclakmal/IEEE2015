/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XtremeCS2015;

import java.util.Scanner;

/**
 *
 * @author Chanaka
 */
public class AGameOfCakes {

    static char plate[];
    static String player = "A";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        plate = line.toCharArray();

//        clearEnd();
        logic(0);
    }

    public static void logic(int t) {
        for (int i = t; i < plate.length; i++) {
            clearEnd();
            if (plate[i] == 'c') {
//                System.out.println("OK");
                if (move3(i)) {
//                    System.out.println("MOVE3 " + i);
                    print();
                } else if (move1(i)) {
//                    System.out.println("MOVE1 " + i);
                    print();
                } else {
//                    clearEnd();
                    logic(t + 1);
                    if (player.equals("A")) {
                        System.out.println("YES");
//                        break;
                    } else {
                        System.out.println("NO");
//                        break;
                    }
                }
            }
if (player.equals("A")) {
                        System.out.println("YES");
//                        break;
                    } else {
                        System.out.println("NO");
//                        break;
                    }
//            clearEnd();
        }
    }

    public static boolean clearEnd() {
        if (plate[plate.length - 1] == 'c') {
            plate[plate.length - 1] = '_';
            return true;
        }
        return false;
    }

    public static boolean move1(int x) {
        if (x + 1 < plate.length) {
            if (plate[x + 1] == '_') {
                plate[x] = '_';
                plate[x + 1] = 'c';
                changePlayer();
                return true;
            }
        }
        return false;
    }

    public static boolean move3(int x) {
        if (x + 3 < plate.length) {
            if (plate[x + 3] == '_' && plate[x + 1] == 'c' && plate[x + 2] == 'c') {
                plate[x] = '_';
                plate[x + 3] = 'c';
                changePlayer();
                return true;
            }
        }
        return false;
    }

    public static void changePlayer() {
        if (player.equals("A")) {
            player = "B";
        } else {
            player = "A";
        }
    }

    public static void print() {
        System.out.println(plate);
    }
}
