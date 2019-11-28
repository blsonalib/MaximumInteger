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

    public Float toMaximumFloat(Float x,Float y,Float z) {
        Float maximum=z;
        if(x.compareTo(maximum)>0)
        {
            maximum=x;
        }
        if(y.compareTo(maximum)>0)
        {
            maximum=y;
        }
        return maximum;
    }

    public String toMaximumString(String abc,String efg,String xyz) {
        String maximum=abc;
        if(efg.compareTo(maximum)>0)
        {
            maximum=efg;
        }
        if(xyz.compareTo(maximum)>0)
        {
            maximum=xyz;
        }
        return maximum;
    }
}
