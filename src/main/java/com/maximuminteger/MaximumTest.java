package com.maximuminteger;

public class MaximumTest
{
    public Integer toMaximumInteger(Integer x,Integer y,Integer z)
    {
             Integer maximum=x;
             if(y.compareTo(maximum)>0)
             {
                 maximum=y;
             }
             if(z.compareTo(maximum)>0)
             {
                 maximum=z;
             }
             return maximum;
    }
}
