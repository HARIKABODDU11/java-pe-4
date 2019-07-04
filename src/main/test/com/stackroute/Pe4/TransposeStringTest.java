package com.stackroute.Pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    public TransposeString transposeString;

    @Before
    public void setUp() {
        System.out.println("Before");
        transposeString = new TransposeString();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        transposeString = null;
    }

    @Test
    public void givenStringShouldReturnReverseString() {
        //arrange

        //Act
        String result= transposeString.transpose("a quick brown fox jumps over the lazy dog");
        //Assert
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god", result);

    }

    @Test
    public void givenStringShouldReturnNull() {
        //arrange

        //Act
        String result= transposeString.transpose("a quick brown fox jumps over the lazy dog");
        //Assert
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god", result);

    }


}