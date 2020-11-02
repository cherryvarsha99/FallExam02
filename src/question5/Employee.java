/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.util.Date;

/**
 *
 * @author Sai varsha Vellanki
 */
public class Employee extends Person {

    private String Office;
    private double salary;
    private String datehired;

    /**
     *
     * @param Office
     * @param salary
     * @param datehired
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     */
    public Employee(String Office, double salary, String datehired, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.Office = Office;
        this.salary = salary;
        this.datehired = datehired;
    }

    /**
     *
     * @return
     */
    public String getOffice() {
        return Office;
    }

    /**
     *
     * @param Office
     */
    public void setOffice(String Office) {
        this.Office = Office;
    }

    /**
     *
     * @return
     */
    public double getSalary() {
        return salary;
    }

    /**
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     *
     * @return
     */
    public String getDatehired() {
        return datehired;
    }

    /**
     *
     * @param datehired
     */
    public void setDatehired(String datehired) {
        this.datehired = datehired;
    }

    @Override
    public String toString() {
        return super.toString() + getOffice() + getSalary() + "\n";
    }

}
