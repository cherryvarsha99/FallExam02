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
public class Faculty extends Employee {

    private int officeHrs;
    private int noOfTeachingSubjects;

    /**
     *
     * @param officeHrs
     * @param noOfTeachingSubjects
     * @param office
     * @param salary
     * @param datehired
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     */
    public Faculty(int officeHrs, int noOfTeachingSubjects, String office, double salary, String datehired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, datehired, name, address, phoneNumber, emailAddress);
        this.officeHrs = officeHrs;
        this.noOfTeachingSubjects = noOfTeachingSubjects;
    }

    /**
     *
     * @return
     */
    public int getOfficeHrs() {
        return officeHrs;
    }

    /**
     *
     * @param officeHrs
     */
    public void setOfficeHrs(int officeHrs) {
        this.officeHrs = officeHrs;
    }

    /**
     *
     * @return
     */
    public int getNoOfTeachingSubjects() {
        return noOfTeachingSubjects;
    }

    /**
     *
     * @param noOfTeachingSubjects
     */
    public void setNoOfTeachingSubjects(int noOfTeachingSubjects) {
        this.noOfTeachingSubjects = noOfTeachingSubjects;
    }

    @Override
    public String toString() {
        return super.toString() +"Officehrs:"+ getOfficeHrs() +"number of subject:"+ getNoOfTeachingSubjects() + "\n";
    }

}
