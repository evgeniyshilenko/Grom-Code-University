package com.gromcode.lesson6;

import java.util.Date;

public class DemoHomeWorkLesson7 {

    public static Deal createDeal() {
        Deal deal = new Deal(100, new Date(), false,
                null, "Dnepr", "Ukraine", "Buy");
        return deal;
    }

    public static Deal createDealAndCallMethods() {
        Deal deal = new Deal(100, new Date(), true,
                new Date(), "Kiev", "Ukraine", "SomeValue");
        deal.confirmDeal();
        deal.checkPrice();
        deal.isValidType();
        return deal;
    }

}
