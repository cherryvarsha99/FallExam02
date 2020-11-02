/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class ArrayListDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create Array list of type  object by naming  list since we are adding objects of different class 
        ArrayList<Object> list = new ArrayList<Object>();
        // create object for Loan , Circle  
        Loan l = new Loan(200000, 2.5, 5);
        Circle c = new Circle(7.5);
        //initialize Date object 
        Date d = new Date();
        //initializa String
        String s = "This list represents the objects form different class";
        // add objects to list
        list.add(l);
        list.add(d);
        list.add(s);
        list.add(c);
        // print   list values by uding enhanced for loop
        for (Object ls : list) {
            System.out.println(ls.toString());
        }

    }

}
