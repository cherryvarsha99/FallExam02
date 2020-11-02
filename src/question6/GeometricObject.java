package question6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sai Varsha Vellanki
 */
public abstract class GeometricObject {

    private String color;
    private boolean isFilled;

    /**
     *
     * @param color
     * @param isFilled
     */
    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
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
    public boolean isIsFilled() {
        return isFilled;
    }

    /**
     *
     * @param isFilled
     */
    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    @Override
    public String toString() {
        return "\ncolor: " + getColor() + " and filled: " + isIsFilled();
    }

    /**
     *
     * @return
     */
    //abstarct method whihch needs to get implement in child class
    public abstract double getArea();

    /**
     *
     * @return
     */
    //abstarct method
    public abstract double getPerimeter();

}
