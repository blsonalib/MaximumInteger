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
    @Test
    public void givenMessage_CheckToThreeFloat_ReturnMaximum(){
        MaximumTest maximumTest=new MaximumTest();
        Float max=maximumTest.toMaximumFloat(5.6f,4.2f,8.9f);
        Assert.assertEquals(8.9,max.floatValue(),0.01);
    }
    @Test
    public void givenMessage_CheckToThreeString_ReturnMaximum(){
        MaximumTest maximumTest=new MaximumTest();
        String max=maximumTest.toMaximumString("Sona","Adity","Priya");
        Assert.assertEquals("Sona",max);
    }
}
