package com.gromcode.lesson8.homeWorkLesson8PartOne;

public class Demo {
    private static int[] arr = {7, 15, 12, 8, 6, 29, 1, 33, 16,};

    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.check(arr);
        adder.add(5, 5);
    }
}
