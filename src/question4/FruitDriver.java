/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Sai varsha Vellanki
 */
public class FruitDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create object to fruit class
        Fruit f = new Fruit("blueberry", "purple", "sweet");
        // create object to Banana class and assign it to Fruit reference whihch is nothing but polymorphic substitution
        Fruit banana = new Banana(1, "Banana", "Yellow", "sweet");
// create object to Banana class and assign it to Fruit reference
        Fruit apple = new Apple(3, "Apple", "red", "Sour and Sweet");
        // create object to Banana class and assign it to Fruit reference
        Fruit kiwi = new Kiwi(2, "Kiwi", "green", "tart and Sweet");
        
        // banana is created to Banana class and at first it will look in Banana class for getmainmethod() if it not found then it will search in its super class 
        // which is Fruit class and prints the satement
        // above statement and below print statemnts will be called as late binding polymorphism
        System.out.println(banana.getMainmethod());
// apple object will look for juice method in Apple class and if its there it will invoke that method
// juice method in Apple class invoke mainmethod in Fruit class and this abilityy of deciding which method to call is polymorphism
        System.out.println(apple.juice());
        // there is no juice method in Banana class and hence it will invoke fruit class method
        System.out.println(banana.juice());
      // the fruit object will invoke Fruit class toString()
        System.out.println(f.toString());
        // kiwi object first look for toString() in kiwi class and if exists then it will invoke
        System.out.println(kiwi.toString());

    }

}
