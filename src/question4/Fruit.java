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
public class Fruit {

    private String name;
    private String color;
    private String taste;

    /**
     *
     * @param name
     * @param color
     * @param taste
     */
    public Fruit(String name, String color, String taste) {
        this.name = name;
        this.color = color;
        this.taste = taste;

    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public String getTaste() {
        return taste;
    }

    /**
     *
     * @param taste
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Fruit" + "name=" + name + ", color=" + color + ", taste=" + taste;
    }

    /**
     *
     * @return
     */
    public String juice() {

        return "drink Fruit Juice";
    }

    /**
     *
     * @return
     */
    public String getMainmethod() {

        return " this method exists only in super class";
    }
}
