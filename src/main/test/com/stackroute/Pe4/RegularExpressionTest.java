package com.stackroute.Pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {

    public RegularExpression regularExpression;

    @Before
    public void setUp() {
        System.out.println("Before");
        regularExpression = new RegularExpression();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        regularExpression = null;
    }

    @Test
    public void givenStringShouldReturnTrue() {
        //arrange

        //Act
        boolean result= regularExpression.expression("This is Harry");
        //Assert
        assertEquals(true, result);

    }

    @Test
    public void givenStringShouldReturnFalse() {
        //arrange

        //Act
        boolean result= regularExpression.expression("This is Harry");
        //Assert
        assertEquals(false, result);

    }

    @Test
    public void givenStringShouldReturnNull() {
        //arrange

        //Act
        boolean result= regularExpression.expression(null);
        //Assert
        assertEquals(false, result);

    }
    @Test
    public void givenStringShouldReturnEmpty() {
        //arrange

        //Act
        boolean result= regularExpression.expression("");
        //Assert
        assertEquals(false, result);

    }



}