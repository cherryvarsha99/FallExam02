/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.util.Date;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class Staff extends Employee {

    private String title;

    /**
     *
     * @param title
     * @param Office
     * @param salary
     * @param datehired
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     */
    public Staff(String title, String Office, double salary, String datehired, String name, String address, String phoneNumber, String emailAddress) {
        super(Office, salary, datehired, name, address, phoneNumber, emailAddress);
        this.title = title;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + getTitle() + "\n";
    }

}
