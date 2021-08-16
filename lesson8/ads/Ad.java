package com.gromcode.lesson8.ads;

import java.util.Date;

public class Ad extends BaseEntity {
    Date dateCreated;
    int price;

    public Ad(long id, int price) {
        super(id);
        this.dateCreated = new Date();
        this.price = price;
    }

    public void publishAd() {
        //some logic
    }

    {
        //some logic
    }
}
