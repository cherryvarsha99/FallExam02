/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.time.DayOfWeek;
import java.util.ArrayList;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class SubwayDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // created arraylist of object type
        ArrayList<Object> list = new ArrayList<Object>();
// assign enum value to object  by calling that constant enamName.Constant
        Toppings topping = Toppings.OLIVES;
        //add enum to list
        list.add(SubwayBreads.ITALIAN_HERBAND_CHEESE);
        list.add(Cheese.PEPPER_JACK_CHEESE);
        list.add(topping);
        list.add(Toppings.LETTUCE);
        list.add(Toppings.ONIONS);
        list.add(Toppings.SPINACH);
// enum enumeration by using enum.values()
        System.out.println("Subway Footlong cost Details:");
        for (SubwayBreads breads : SubwayBreads.values()) {
            System.out.println(breads.toString() + " : " + breads.getFootLong());

        }
// printing the list 
        System.out.println("\nMy Order:");
        for (Object ls : list) {
            System.out.println(ls);
        }
        
        // calling default enum constant from default  enum DayOfWeek 
        System.out.println("Order Date:" + DayOfWeek.SATURDAY);

        // printing values of an enum constant
        Cheese c = Cheese.valueOf("PEPPER_JACK_CHEESE");
        System.out.println(c);

    }

}
