package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleTrackerTest {

    @Test
    public void whenAskSingleTrackerTwiceThenGetOnlyOneTracker() {
        Tracker firstTracker = SingleTracker.getTracker();
        Tracker secondTracker = SingleTracker.getTracker();
        assertEquals(firstTracker, secondTracker);
    }

}