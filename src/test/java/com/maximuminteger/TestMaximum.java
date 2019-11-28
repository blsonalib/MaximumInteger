package com.maximuminteger;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    @Test
    public void givenMessage_CheckToThreeInteger_ReturnMaximum(){
        Integer max = MaximumTestGeneric.toMaximum(40, 20, 30);
        Assert.assertEquals((Integer) 40,max);
    }
    @Test
    public void givenMessage_CheckToThreeFloat_ReturnMaximum(){
        Float max=MaximumTestGeneric.toMaximum(6.7f,8.9f,3.2f);
        Assert.assertEquals((Float)8.9f,max);
    }
    @Test
    public void givenMessage_CheckToThreeString_ReturnMaximum(){

        String max=MaximumTestGeneric.toMaximum("Sona","Adity","Priya");
        Assert.assertEquals((String) "Sona",max);
    }
}
