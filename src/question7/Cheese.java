/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Sai Varsha Vellanki
 */
public enum Cheese {

    /**
     *
     */
    AMERICAN_CHEESE(0.55),
    /**
     *
     */
    CHEDDAR_CHEESE(0.60),
    /**
     *
     */
    CHEDDAR_JACK_CHEESE(0.70),
    /**
     *
     */
    PEPPER_JACK_CHEESE(0.59),
    /**
     *
     */
    QUESO_CHEESE(0.65),
    /**
     *
     */
    SWISS_CHEESE(0.60),
    /**
     *
     */
    BLUE_CHEESE(0.60),
    /**
     *
     */
    RANCH(0.60),
    /**
     *
     */
    NO_CHEESE(0.0);

    private double CheesePrice;

    private Cheese(double CheesePrice) {
        this.CheesePrice = CheesePrice;
    }

    /**
     *
     * @return
     */
    public double getCheesePrice() {
        return CheesePrice;
    }

}
