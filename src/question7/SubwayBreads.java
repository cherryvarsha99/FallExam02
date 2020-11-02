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
public enum SubwayBreads {

    /**
     *
     */
    WHEAT_BREAD(8.5, 5.5),
    /**
     *
     */
    WHITE_BREAD(8.00, 5.00),
    /**
     *
     */
    ITALIAN_HERBAND_CHEESE(9.0, 6.0),
    /**
     *
     */
    MALTED_RYE(8.5, 5.5);

    private double footLong;
    private double sixInch;

    private SubwayBreads(double footLong, double sixInch) {
        this.footLong = footLong;
        this.sixInch = sixInch;
    }

    /**
     *
     * @return
     */
    public double getFootLong() {
        return footLong;
    }

    /**
     *
     * @return
     */
    public double getSixInch() {
        return sixInch;
    }

}
