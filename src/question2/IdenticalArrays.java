/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Scanner;

/**
 *
 * @author Sai varsha vellanki
 */
public class IdenticalArrays {

    /**
     * @param m1
     * @param m2
     * @return
     */
    public static boolean equals(int[][] m1, int[][] m2) {

        boolean equal = true;
//checking if the length of both array rows and cloumns are same if not we saying both arrays are not identical
        if (m1.length * m1[0].length != m2.length * m2[0].length) {
            equal = false;
        }
// comparing  array1   rows and column values with array 2 and if bot are not equal then they are not identical 
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {

                if (m1[i][j] != m2[i][j]) {
                    equal = false;
                }
            }
        }

        return equal;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // initialize array m1 and m2 of integer type
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list1: ");
//scanning 3*# matrix array values by using for loop for rows and columns
        for (int i = 0; i < m1.length; i++) {

            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        
        //scanning second list of 3*# array values
        System.out.print("Enter list2: ");
        for (int i = 0; i < m2.length; i++) {

            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
//invoking equals (m1,m2)
        if (equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }

    }

}
