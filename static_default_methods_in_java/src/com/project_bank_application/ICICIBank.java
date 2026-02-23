package com.project_bank_application;

public class ICICIBank implements BankApplication {

    @Override
    public void bankName() {
        System.out.println("WELCOME TO ICICI BANK");
        System.out.println(new ICICIBank().RBI_GUIDE_LINES());
        System.out.println(BankApplication.ICICI_BANK_GUIDELINES());
    }

    @Override
    public void findLoanType(String loanType) {

        if (loanType.equals("home loan") ||
                loanType.equals("car loan") ||
                loanType.equals("personal loan") ||
                loanType.equals("crop loan")) {

            LoanService.loanApplication();

        } else {
            System.out.println("Invalid loan type");
        }
    }
}