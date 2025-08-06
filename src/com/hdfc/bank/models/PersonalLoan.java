package com.hdfc.bank.models;

public class PersonalLoan extends Loan{
    public PersonalLoan(int loanId, String customerName, double loanAmount, String purpose) {
        super(loanId, customerName, loanAmount);
        this.purpose =purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    private String purpose;
    @Override
    public double calculateEMI() {
        double p = getLoanAmount();
        double r = 12;
        r = (r / 100)/12;
        double t =12;
        double emi = (p * r * (float)Math.pow(1 + r, t))
                / (float)(Math.pow(1 + r, t) - 1);
        System.out.println("EMI: "+emi);
        return emi;
    }

    public void printDetails(){
        super.printDetails();
        System.out.println("Purpose: " +purpose);
    }
}
