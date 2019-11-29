package com.maximuminteger;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    @Test
    public void givenMessage_CheckToThreeInteger_ReturnMaximum(){
        Integer max = (Integer) MaximumTestGeneric.toMaximum(40, 60, 70,8093,76);
        Assert.assertEquals((Integer) 8093,max);
    }
    @Test
    public void givenMessage_CheckToThreeFloat_ReturnMaximum(){
        Float max=(Float) MaximumTestGeneric.toMaximum(6.7f,8.9f,3.2f,33.8f,90.7f,56f);
        Assert.assertEquals((Float)90.7f,max);
    }
    @Test
    public void givenMessage_CheckToThreeString_ReturnMaximum(){

        String max=(String)MaximumTestGeneric.toMaximum("Sona","Adity","Priya","Neha","Rekha","Zina");
        Assert.assertEquals((String) "Zina",max);
    }
}
