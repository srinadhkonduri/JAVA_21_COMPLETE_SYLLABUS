package com.project_bank_application;

public class HDFCBank implements BankApplication {


    @Override
    public void bankName() {
        System.out.println("WELCOME TO HDFC BANK");
        System.out.println(new HDFCBank().RBI_GUIDE_LINES());
        System.out.println(BankApplication.HDFC_BANK_GUIDELINES());
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