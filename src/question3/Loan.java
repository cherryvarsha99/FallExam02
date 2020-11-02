/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Sai varsha Vellanki
 */
public class Loan {

    private double loanAmount;
    private double interest;
    private double noOfYears;
    private double monthlyPayment;

    /**
     *
     * @param loanAmount
     * @param interest
     * @param noOfYears
     */
    public Loan(double loanAmount, double interest, double noOfYears) {
        this.loanAmount = loanAmount;
        this.interest = interest;
        this.noOfYears = noOfYears;
    }

    /**
     *
     * @return
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     *
     * @param loanAmount
     */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     *
     * @return
     */
    public double getInterest() {
        return interest;
    }

    /**
     *
     * @param interest
     */
    public void setInterest(double interest) {
        this.interest = interest;
    }

    /**
     *
     * @return
     */
    public double getNoOfYears() {
        return noOfYears;
    }

    /**
     *
     * @param noOfYears
     */
    public void setNoOfYears(double noOfYears) {
        this.noOfYears = noOfYears;
    }

    @Override
    public String toString() {
        return "Loan Details: \n " + "Loan Amount: " + getLoanAmount() + ", " + "Interest Rate: " + getInterest() + ", " + "Number Of Years: " + getNoOfYears() + "\n "
                + "Monthly payment: " + monthlyPayment() + "\n" + "Total amount: " + getTotalPayment() + "\n";
    }

    /**
     *
     * @return
     */
    // calculating monthly papyment and return double value
    public double monthlyPayment() {
        double monthlyInterestRate = interest / 1200;
        monthlyPayment = loanAmount * monthlyInterestRate / (1 - Math.pow(1 / (1 + monthlyInterestRate), noOfYears * 12));
        return monthlyPayment;
    }

    /**
     *
     * @return
     */
    // calculating total payment snd return double value
    public double getTotalPayment() {
        return monthlyPayment() * getNoOfYears() * 12;
    }

}
