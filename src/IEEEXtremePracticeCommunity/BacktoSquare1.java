package IEEEXtremePracticeCommunity;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chanaka
 */
public class BacktoSquare1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (true) {
            count++;
            String s = scan.nextLine();
            if (count % 2 == 0) {
                String arr[] = s.split(" ");
                double sum = 1;
                double temp = 1;
                for (int i = 0; i < arr.length; i++) {
                    temp = (temp) / Double.parseDouble((arr[arr.length - 1 - i]));
                    sum += temp;
                }
                System.out.println((int) (sum + 0.5));
            }
            if (s.equals("1")) {
                count++;
                System.out.println("1");
            }
            if (s.equals("0")) {
                break;
            }
        }
    }
}
