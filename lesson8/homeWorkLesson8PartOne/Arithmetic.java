package com.gromcode.lesson8.homeWorkLesson8PartOne;

public class Arithmetic {
    private static int[] arr = {5, 8, 17, 20, 6, 19, 1, 3, 11,};

    public static void main(String[] args) {
        check(arr);
    }

    public static boolean check(int[] array) {

        return maxElement(array) + minElement(array) > 100;
    }

    public static int maxElement(int[] array) {
        int max = array[ 0 ];
        for (int el : array) {
            if (el > max) {
                max = el;
            }
        }
        return max;
    }

    public static int minElement(int[] array) {
        int min = array[ 0 ];
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

}
