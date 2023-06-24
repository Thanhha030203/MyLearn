package com.ps20520.testbai;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ps20520.test.JunitMessage;

public class AirthmaticsTest {
    public String message = "Foly exception";
    JunitMessage junitmessage = new JunitMessage(message);

    @Test(expected = ArithmeticException.class)
    public void testJunitMessage() throws Exception {
        System.out.println("Fpoly Junit Message exception");
        junitmessage.printMessage();
    }

    @Test
    public void testJunitHiMessage() {
        message = "Hi" + message;
        System.out.println("Fpoly Junit Message is printing");
        assertEquals(message, junitmessage.printHiMessage());
    }
}
