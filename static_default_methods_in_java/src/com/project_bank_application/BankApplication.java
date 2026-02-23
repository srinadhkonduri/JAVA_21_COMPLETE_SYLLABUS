package com.project_bank_application;

public interface BankApplication {

    void bankName();
    void findLoanType(String loanType);

    default String RBI_GUIDE_LINES(){
        return "From July 1, 2026, stricter RBI rules make mis-selling of financial products a defined offense under Indian law.\n" +
                "\n" +
                "Banks must obtain explicit consent, cannot bundle products without clear choice, and may have to refund/compensate customers where mis-selling is proven.";
    }

    static String ICICI_BANK_GUIDELINES(){
        return "iciciBank.RBI_GUIDE_LINES()";
    }

    static String HDFC_BANK_GUIDELINES(){
        return "hdfcBank.RBI_GUIDE_LINES()";
    }
}