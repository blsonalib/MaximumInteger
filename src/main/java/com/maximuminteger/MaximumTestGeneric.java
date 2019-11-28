package com.maximuminteger;

public class MaximumTestGeneric
{
    public static <T extends Comparable<T>>T  toMaximum(T num1,T num2,T num3){
        T maximum=num1;
        if(num2.compareTo(maximum)>0)
        {
            maximum=num2;
        }
        if(num3.compareTo(maximum)>0)
        {
            maximum=num3;
        }
        return maximum;
    }
}
