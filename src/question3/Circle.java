/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author S540114
 */
public class Circle {

    private double radius;

    /**
     *
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return
     */
    public double getRadius() {
        return radius;
    }

    /**
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "\nCircle Details: \n" + "Raidus: " + getRadius() + "\n" + "Area Of Circle is: " + String.format("%.2f", areaOfCircle(radius)) + "\n" + "Circumference Of Circle is: " + String.format("%.2f", circumferenceOfCircle(radius));
    }

    /**
     *
     * @param radius
     * @return
     */
    // calculate are of circle
    public double areaOfCircle(double radius) {
        return (22 * radius * radius) / 7;
    }

    /**
     *
     * @param radius
     * @return
     */
    // calculate circumference of circle
    public double circumferenceOfCircle(double radius) {
        return (2 * radius * 22) / 7;
    }

}
