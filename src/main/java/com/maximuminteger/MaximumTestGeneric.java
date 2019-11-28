package com.maximuminteger;

public class MaximumTestGeneric<T extends Comparable>
{
    private T num1;
    private T num2;
    private T num3;

    public MaximumTestGeneric(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public static  <T extends Comparable<T>> T toMaximum(T num1, T num2, T num3){
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
    public <T extends Comparable<T>> T toMaximum(){
    T maximum= (T) MaximumTestGeneric.toMaximum(num1,num2,num3);
    return maximum;
}
}
