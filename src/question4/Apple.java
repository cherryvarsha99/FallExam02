/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Sai Varsha Vellanki
 */
// here we extended Fruit class to apple indicating Apple inherits Fruit class and it properties
public class Apple extends Fruit {

    private int weight;

    public Apple(int weight, String name, String color, String taste) {
        super(name, color, taste);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String juice() {

        return "drink Apple Juice" + "  "+getMainmethod();
    }

    @Override
    public String toString() {
        return super.toString() + "weight=" + weight + "kgs";
    }
    
   
}
