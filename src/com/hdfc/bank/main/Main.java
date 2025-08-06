package com.hdfc.bank.main;

import com.hdfc.bank.models.HomeLoan;
import com.hdfc.bank.models.Loan;
import com.hdfc.bank.models.PersonalLoan;
import com.hdfc.bank.services.LoanUtils;



public class Main {
    public static void main(String[] args) {

        PersonalLoan pl = new PersonalLoan(101,"Dipesh",100000,"Perosnal purchases");


        HomeLoan hl = new HomeLoan(102,"Deepesh",150000,"123 Road, ABC Colony");


        Loan[] loansArray = { pl, hl };
        System.out.println("Loans in the array:");
        for (Loan loan : loansArray) {
            System.out.println(loan);
        }

        hl.applyInsurance();
        hl.applyInsurance(102);

        LoanUtils util = new LoanUtils();
        util.printEMIDetails(pl);
        pl.calculateEMI();
        util.printEMIDetails(hl);
        hl.calculateEMI();

    }
}