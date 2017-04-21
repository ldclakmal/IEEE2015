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
public class NewspaperNews {

    public static void main(String[] args) {
        int count = 0;

        Scanner scan = new Scanner(System.in);

        String line1 = scan.nextLine();
        String line2 = scan.nextLine();

        char row1[] = line1.toCharArray();
        char row2[] = line2.toCharArray();

        for (int i = 0; i < row1.length; i++) {
            if (i < row1.length - 1 && i > 0) {
                if (row1[i + 1] != 'T' && row2[i] != 'T' && row2[i + 1] != 'T' && row1[i - 1] != 'T' && row2[i - 1] != 'T') {
                    row1[i] = 'T';
                }
            } else if (i == 0 && i < row1.length - 1) {
                if (row1[i + 1] != 'T' && row2[i] != 'T' && row2[i + 1] != 'T') {
                    row1[i] = 'T';
                }
            } else if (i == row1.length - 1) {
                if (row1[i - 1] != 'T' && row2[i] != 'T' && row2[i - 1] != 'T') {
                    row1[i] = 'T';
                }
            }
        }

        for (char c : row1) {
            if (c == 'T') {
                count++;
            }
        }

        for (char c : row2) {
            if (c == 'T') {
                count++;
            }
        }

        System.out.println(count);
    }
}
