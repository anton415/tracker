package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BatteryTest {

    @Test
    public void when50exchange50then100() {
        Battery firstBattery = new Battery(50);
        Battery secondBattery = new Battery(50);
        firstBattery.exchange(secondBattery);
        assertThat(secondBattery.getLoad(), is(100));
    }

    @Test
    public void when0exchange50then50() {
        Battery firstBattery = new Battery();
        Battery secondBattery = new Battery(50);
        firstBattery.exchange(secondBattery);
        assertThat(secondBattery.getLoad(), is(50));
    }

    @Test
    public void when10exchange50then60() {
        Battery firstBattery = new Battery(10);
        Battery secondBattery = new Battery(50);
        firstBattery.exchange(secondBattery);
        assertThat(secondBattery.getLoad(), is(60));
    }
}