package com.gromcode.lesson8.ads;

public class HouseAd extends Ad {
    String ownerName;
    String address;
    double square;
    int floors;

    public HouseAd(long id, int price, String address, double square, int floors) {
        super(id, price);
        this.address = address;
        this.square = square;
        this.floors = floors;
    }

    public boolean checkOwner() {
        Owners owners = new Owners();
        for (String ow : owners.ownerName) {
            if (ownerName == ow) {
                return true;
            }
        }
        return false;
    }
}