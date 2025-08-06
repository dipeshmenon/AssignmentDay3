package com.hdfc.bank.models;

public class HomeLoan extends Loan{


    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    private String propertyAddress;
    public HomeLoan(int loanId, String customerName, double loanAmount, String propertyAddress) {
        super(loanId, customerName, loanAmount);
        this.propertyAddress =propertyAddress;
    }
    @Override
    public double calculateEMI() {

        double p = getLoanAmount();
        double r = 6;
        r = (r / 100)/12;
        double t =12;
        double emi = (p * r * (float)Math.pow(1 + r, t))
                / (float)(Math.pow(1 + r, t) - 1);
        System.out.println("EMI: "+emi);
    return emi;
    }

    public void printDetails(){
        super.printDetails();
        System.out.println("Address: "+propertyAddress);

    }

    public void applyInsurance(){
        System.out.println("Insurance applied for Home Loan");
    }
    public void applyInsurance(int loanId){
        double insuranceamt = (getLoanAmount()+(0.8*12));
        System.out.println("Insurance amount for the loan ID would be: " +insuranceamt);
    }
}
