package com.maximuminteger;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    @Test
    public void givenMessage_CheckToThreeInteger_ReturnMaximum(){
        MaximumTestGeneric maximumTest=new MaximumTestGeneric();
        Integer max=maximumTest.toMaximum(40,20,30);
        Assert.assertEquals(40,max.intValue());
    }
    @Test
    public void givenMessage_CheckToThreeFloat_ReturnMaximum(){
        MaximumTestGeneric maximumTest=new MaximumTestGeneric();
        Float max=maximumTest.toMaximum(5.6f,4.2f,8.9f);
        Assert.assertEquals(8.9,max.floatValue(),0.01);
    }
    @Test
    public void givenMessage_CheckToThreeString_ReturnMaximum(){
        MaximumTestGeneric maximumTest=new MaximumTestGeneric();
        String max=maximumTest.toMaximum("Sona","Adity","Priya");
        Assert.assertEquals("Sona",max);
    }
}
