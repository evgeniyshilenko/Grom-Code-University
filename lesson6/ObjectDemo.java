package com.gromcode.lesson6;

public class ObjectDemo {
    public static void main(String[] args) {
        Car objectCar = new Car(12000, 2015, "Vladimir");
        System.out.println(objectCar.color);
        System.out.println(objectCar.horsePower);
        System.out.println(objectCar.ownerName);

        objectCar.horsePower = 100;
        System.out.println(objectCar.horsePower);
        objectCar.startRun();
        objectCar.stopRun();
        objectCar.changeOwner("Evheniy");
        System.out.println(objectCar.ownerName);
        Car objectCarNull = null;
    }
}
