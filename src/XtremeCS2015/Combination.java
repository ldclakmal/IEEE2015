/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XtremeCS2015;

/**
 *
 * @author Chanaka
 */
public class Combination {

    // print all subsets of the characters in s
    public static void comb1(String s) { comb1("", s); }

    // print all subsets of the remaining elements, with given prefix 
    private static void comb1(String prefix, String s) {
        if (s.length() > 0) {
            System.out.println(prefix + s.charAt(0));
            comb1(prefix + s.charAt(0), s.substring(1));
            comb1(prefix,               s.substring(1));
        }
    }  

    // read in N from command line, and print all subsets among N elements
    public static void main(String[] args) {
       int N = 3;
       String alphabet = "abc";
       String elements = alphabet.substring(0, N);

       // using first implementation
       comb1(elements);
       System.out.println();
    }

}
