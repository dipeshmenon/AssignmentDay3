package com.hdfc.bank.models;

public abstract class Loan {

    final static String BANK_NAME ="HDFC Life";
    final int loanId;
    private String customerName;
    protected double loanAmount;

    public Loan(int loanId, String customerName, double loanAmount) {
        this.loanId = loanId;
        this.customerName = customerName;
        this.loanAmount = loanAmount;
    }

    public int getLoanId() {
        return loanId;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public abstract double calculateEMI();

    public void printDetails(){

        System.out.println(BANK_NAME + " | " +loanId+ " | "+customerName+ " | " + loanAmount);
    }

    @Override
    public String toString() {
        return loanId + " | " + customerName + " | " + loanAmount ;
    }
}
