package com.maximuminteger;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    @Test
    public void givenMessage_CheckToThreeInteger_ReturnMaximum(){
        MaximumTest maximumTest=new MaximumTest();
        Integer max=maximumTest.toMaximumInteger(40,20,30);
        Assert.assertEquals(40,max.intValue());
    }
}
