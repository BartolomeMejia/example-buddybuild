package com.example.bartolomem.task1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by BartolomeM on 4/12/2017.
 */
public class PruebaTestTest {

    private PruebaTest testText = new PruebaTest();

    @Test
    public void helloWorld() {
        Assert.assertEquals("Hla Mundo", testText.helloWorld());
    }

}