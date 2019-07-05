package com.stackroute.Pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReplaceTest {

        public StringReplace stringReplace;

        @Before
        public void setUp() {
            System.out.println("Before");
            stringReplace = new StringReplace();
        }

        @After
        public void tearDown() {
            System.out.println("After");
            stringReplace = null;
        }

        @Test
        public void givenStringShouldReturnReplaceString() {
            //arrange

            //Act
            String result= stringReplace.stringRepl("daily dry");
            //Assert
            assertEquals("faity fry", result);

        }

    @Test
    public void givenStringShouldReturnEmpty() {
        //arrange

        //Act
        String result= stringReplace.stringRepl("");
        //Assert
        assertEquals("empty", result);

    }

    @Test
    public void givenStringShouldReturnNull() {
        //arrange

        //Act
        String result= stringReplace.stringRepl(null);
        //Assert
        assertEquals("null", result);

    }

}