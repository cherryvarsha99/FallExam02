/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author S540114
 */
public enum Toppings {

    /**
     *
     */
    LETTUCE(0, 0.5),
    /**
     *
     */
    ONIONS(0, 0.5),
    /**
     *
     */
    OLIVES(0, 0.5),
    /**
     *
     */
    SPINACH(0, 0.5),
    /**
     *
     */
    JALPENOS(0, 0.5),
    /**
     *
     */
    CUCUMBERS(0, 0.5),
    /**
     *
     */
    CARROTS(0, 0.5),
    /**
     *
     */
    CHICKEN(0, 2);

    private double toppingPrice;
    private double extraToppingPrice;

    private Toppings(double toppingPrice, double extraToppingPrice) {
        this.toppingPrice = toppingPrice;
        this.extraToppingPrice = extraToppingPrice;
    }

    /**
     *
     * @return
     */
    public double getToppingPrice() {
        return toppingPrice;
    }

    /**
     *
     * @return
     */
    public double getExtraToppingPrice() {
        return extraToppingPrice;
    }
}
