/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class TriangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the sides of Triangle: ");
        
        double side1=sc.nextDouble();
        double side2= sc.nextDouble();
        double side3= sc.nextDouble();
        sc.nextLine();
        
        String color = null;
        boolean value = false;
        System.out.print("Enter color :");
        
        
        //create object for Triangle class
        
        GeometricObject t= new Triangle(side1,side2,side3,color,value);
        //set color by using input scan
        t.setColor(sc.nextLine());
        System.out.print("Enter True or False value to indicate if traingle filled:"); 
        // set isFilled() by using input scan
        t.setIsFilled(sc.nextBoolean());
        
       // print the object which prints toString() 
        System.out.println(t);
       
    }
    
}
