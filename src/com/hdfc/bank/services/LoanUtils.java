package com.hdfc.bank.services;

import com.hdfc.bank.models.HomeLoan;
import com.hdfc.bank.models.Loan;
import com.hdfc.bank.models.PersonalLoan;

public class LoanUtils {

public void printEMIDetails (Loan loan){

        if(loan instanceof HomeLoan){
            HomeLoan hl = (HomeLoan) loan;
            hl.printDetails();
        }

        else if (loan instanceof PersonalLoan){
            PersonalLoan pl = (PersonalLoan) loan;
            pl.printDetails();
        }
}
}
