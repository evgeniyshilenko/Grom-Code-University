package com.gromcode.lesson9.creatNewEncapsulation;

import com.gromcode.lesson9.creatNewEncapsulation.utils.Checker;

public class Demo {
    public static void main(String[] args) {
        Company company = new Company();
        System.out.println(company.getCountryFounded());
        System.out.println(company.getName());

        company.setName("NewValue");
        company.setName("IBM");
        Checker checker = new Checker();
        System.out.println(checker.checkCompanyName(company.getName()));
    }
}
