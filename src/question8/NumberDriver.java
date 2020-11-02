/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class NumberDriver {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // create object to three class
            One hippo = new Three();
            // invoke guess() by Three class object 
    System.out.println(hippo.guess(4));
    //invoke apply() by Three class object 
   System.out.println(hippo.apply(12));
//create object to one class
   One lion = new One(-1);
   //invoke apply() by one  class object 
    System.out.println(lion.guess(5));
    System.out.println(lion.apply(6));        

    }
    
}
