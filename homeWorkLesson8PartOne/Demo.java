package com.gromcode.lesson8.homeWorkLesson8PartOne;

public class Demo {
    private static int[] arr = {5, 8, 17, 20, 6, 19, 1, 3, 11,};

    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.check(arr));
        adder.add(5, 5);
    }
}
