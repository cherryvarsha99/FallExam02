/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class Triangle extends GeometricObject{

    private double side1;
    private double side2;
    private double side3;

    /**
     *
     * @param side1
     * @param side2
     * @param side3
     * @param color
     * @param isFilled
     */
    public Triangle(double side1, double side2, double side3, String color, boolean isFilled) {
        super(color, isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     *
     * @return
     */
    public double getSide1() {
        return side1;
    }

    /**
     *
     * @param side1
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     *
     * @return
     */
    public double getSide2() {
        return side2;
    }

    /**
     *
     * @param side2
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     *
     * @return
     */
    public double getSide3() {
        return side3;
    }

    /**
     *
     * @param side3
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle: \n"+"side1: "+getSide1()+",Side2: "+getSide2()+",Side3: "+getSide3()+"\nTraingle area: "+String.format("%.2f", getArea())+"\nTriangle perimeter: "+String.format("%.2f", getPerimeter())
                +super.toString();
    }

    /**
     *
     * @return
     */
    @Override
    // calculate area of triangle in the  method declared in abstract class
    public double getArea() {
        
        double s=(side1+side2+side3)/2;
        
        double area= Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
        
    }

    /**
     *
     * @return
     */
    @Override
    //calculate perimeter of triangle in the  method declared in abstract class
    public double getPerimeter() {
        double perimeter= side1+side2+side3;
        
        return perimeter;
    }
    

}
