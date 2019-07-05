package com.stackroute.Pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCountTest {
    public CharacterCount characterCount;

    @Before
    public void setUp() {
        System.out.println("Before");
        characterCount = new CharacterCount();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        characterCount = null;
    }

    @Test
    public void givenStringShouldReturnCount() {
        //arrange

        //Act
        String result= characterCount.count("JavaAA java",'a');
        //Assert
        assertEquals("occurence of A :"+6, result);

    }

    @Test
    public void givenStringShouldReturnEmpty() {
        //arrange

        //Act
        String result= characterCount.count("",'a');
        //Assert
        assertEquals("empty", result);

    }

    @Test
    public void givenStringShouldReturnNull() {
        //arrange

        //Act
        String result= characterCount.count(null,'a');
        //Assert
        assertEquals("occurence of A :0", result);

    }
    @Test
    public void givenStringShouldReturnErrorMessage() {
        //arrange

        //Act
        String result= characterCount.count("",'*');
        //Assert
        assertEquals("empty", result);

    }



}