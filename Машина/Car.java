
public class Car {

    внутренняя цена;

    int yearOfManufacturing;

    Цвет струны;

    String ownerName;

    двойной вес;

    int horsePower;

    public Car (int price, int yearOfManufacturing, String ownerName) {

        this.price = цена;

        this.yearOfManufacturing = yearOfManufacturing;

        this.ownerName = имя владельца;

    }

    public void startRun () {

        System.out.println («Я бегу ...»);

    }

    public void stopRun () {

        System.out.println («Я останавливаюсь ...»);

    }

    public void changeOwner (String newOwnerName) {

        ownerName = newOwnerName;

    }

}
