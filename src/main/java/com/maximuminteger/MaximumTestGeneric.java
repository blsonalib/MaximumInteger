package com.maximuminteger;

import java.util.Arrays;

public class MaximumTestGeneric<T extends Comparable>
{
    public static <T extends Comparable<T>> T toMaximum(T... array) {
        Arrays.sort(array);
        T max= array[array.length - 1];
        MaximumTestGeneric.printMax(max);
        return max;
    }

    private static <T extends Comparable<T>> void  printMax(T max) {
        System.out.println("Maximum Value:"+max);
    }

}
