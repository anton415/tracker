package ru.job4j.ex;

import org.junit.Assert;
import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLessMinusOneThenIllegalArgumentException() {
        Fact fact = new Fact();
        fact.calc(-1);
    }

    @Test()
    public void whenNOneThenOne() {
        Fact fact = new Fact();
        int result = fact.calc(1);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test()
    public void whenNThreeThenSix() {
        Fact fact = new Fact();
        int result = fact.calc(3);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

}