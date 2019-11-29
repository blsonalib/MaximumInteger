package com.maximuminteger;

import java.util.Arrays;

public class MaximumTestGeneric<T extends Comparable>
{
    public static <T extends Comparable<T>> T toMaximum(T... array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }
}
