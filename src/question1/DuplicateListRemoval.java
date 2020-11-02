/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sai varsha vellanki
 */
public class DuplicateListRemoval {

    /**
     * @param list
     */
    public static void removeDuplicate(ArrayList<Integer> list) {

        ArrayList<Integer> secondList = new ArrayList<Integer>();

     // implementing enhanced for loop to get non repeated integers
        for (Integer numbers : list) {

            if (!secondList.contains(numbers)) {

                secondList.add(numbers);
            }

        }
        // remove all the values from list and add new list with no duplicate integers
        list.removeAll(list);
       
        list.addAll(secondList);
        
        
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        // int number= sc.nextInt();
        // scan the intergers and add to arraylist list
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        sc.close();
        // invoke removeduplicate () 
        removeDuplicate(list);
        //removeDuplicate(list);
        
        System.out.print("The distinct integers are ");
        // print all the values in list by using enhanced for loop
       for (Integer numbers : list) {

           System.out.print(numbers+" ");
       }
    }

}
