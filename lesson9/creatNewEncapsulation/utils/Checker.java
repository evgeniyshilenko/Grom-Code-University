package com.gromcode.lesson9.creatNewEncapsulation.utils;

public class Checker {
    private int companyNamesValidatedCount;

    public boolean checkCompanyName(String companyName) {
        if (companyNamesValidatedCount > 10)
            return false;
        companyNamesValidatedCount++;
        return companyName != "Google" && companyName != "Amazon";
    }

}
