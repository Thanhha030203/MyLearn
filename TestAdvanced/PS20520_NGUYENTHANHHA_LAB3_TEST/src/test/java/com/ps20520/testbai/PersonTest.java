package com.ps20520.testbai;

import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.ps20520.test.Person;

public class PersonTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testExpectedException() {
        exception.expect(IllegalArgumentException.class);
        new Person("Fpoly", -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExpectedException2() {

        new Person("Fpoly", -1);
    }

    @Test
    public void testExpectedException3() {
        try {
            new Person("Fpoly", -1);
            fail("Should have thrown an IllegalArgunmentException beacuse is invalid");
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
        }

    }
}
