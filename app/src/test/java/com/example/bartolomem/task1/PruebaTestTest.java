package com.example.bartolomem.task1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by BartolomeM on 4/12/2017.
 */
public class PruebaTestTest {

    private PruebaTest testText = new PruebaTest();

    @Test
    public void helloWorld() {
        Assert.assertEquals("Prueba completa", testText.helloWorld());
    }

    @Test
    public void suma() { Assert.assertEquals(4, testText.suma()); }
}