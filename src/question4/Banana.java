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
public class Banana extends Fruit{
    
    /**
     *
     */
    public int noOfDozens;

    /**
     *
     * @param noOfDozens
     * @param name
     * @param color
     * @param taste
     */
    public Banana(int noOfDozens, String name, String color, String taste) {
        super(name, color, taste);
        this.noOfDozens = noOfDozens;
    }

    /**
     *
     * @return
     */
    public int getNoOfDozens() {
        return noOfDozens;
    }

    /**
     *
     * @param noOfDozens
     */
    public void setNoOfDozens(int noOfDozens) {
        this.noOfDozens = noOfDozens;
    }

    @Override
    public String toString() {
        return super.toString() + "noOfDozens=" + noOfDozens + '}';
    }
     
    /**
     *
     * @return
     */
    // this method exists only in subclass
    public String getSubClassMEthod(){
        
        return "this method exists only in subClass";
    }
    
}
