package com.gromcode.lesson8.homeWorkLesson8PartOne;

public class Arithmetic {

    public boolean check(int[] array) {

        return maxElement(array) + minElement(array) > 100;
    }

    public int maxElement(int[] array) {
        int max = array[ 0 ];
        for (int el : array) {
            if (el > max) {
                max = el;
            }
        }
        return max;
    }

    public int minElement(int[] array) {
        int min = array[ 0 ];
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

}
