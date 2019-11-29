package com.maximuminteger;

import java.util.Arrays;

public class  MaximumValue <T>{

    public T ismaximum(T... args)
    {

        Arrays.sort(args);
         return args[args.length - 1];
    }

}
