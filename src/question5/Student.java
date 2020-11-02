/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Sai varsha Vellanki
 */
public class Student extends Person {

    private String grade;

    private static final String classstatus = "Graduate";

    /**
     *
     * @param grade
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     */
    public Student(String grade, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    /**
     *
     * @return
     */
    public String getGrade() {
        return grade;
    }

    /**
     *
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() +" classstatus:"+ classstatus + "\n";
    }

}
