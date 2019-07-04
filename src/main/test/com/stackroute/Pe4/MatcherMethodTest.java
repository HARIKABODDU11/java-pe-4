package com.stackroute.Pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatcherMethodTest {

        public MatcherMethod matcherMethod;

        @Before
        public void setUp() {
            System.out.println("Before");
            matcherMethod = new MatcherMethod();
        }

        @After
        public void tearDown() {
            System.out.println("After");
            matcherMethod = null;
        }

        @Test
        public void givenStringShouldReturnSubstringRange() {
            //arrange

            //Act
            String result= matcherMethod.match("She sells seashells by the seashore","se");
            //Assert
            assertEquals("Found at: 4 - 6\n" +
                    "Found at: 10 - 12\n" +
                    "Found at: 27 - 29", result);

        }

    @Test
    public void givenStringShouldReturnEmpty() {
        //arrange

        //Act
        String result= matcherMethod.match("","se");
        //Assert
        assertEquals("Empty", result);

    }


    }