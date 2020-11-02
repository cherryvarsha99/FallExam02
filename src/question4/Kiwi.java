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
public class Kiwi extends Fruit {

    private int noOfbox;

    /**
     *
     * @param noOfbox
     * @param name
     * @param color
     * @param taste
     */
    public Kiwi(int noOfbox, String name, String color, String taste) {
        super(name, color, taste);
        this.noOfbox = noOfbox;
    }

    /**
     *
     * @return
     */
    public int getNoOfbox() {
        return noOfbox;
    }

    /**
     *
     * @param noOfbox
     */
    public void setNoOfbox(int noOfbox) {
        this.noOfbox = noOfbox;
    }

    @Override
    public String toString() {
        return super.toString() + "noOfbox=" + noOfbox + '}';
    }

    /**
     *
     * @return
     */
    @Override
    // overwriting juice method form parent class
    public String juice() {

        return "drink Kiwi Juice";
    }

}
