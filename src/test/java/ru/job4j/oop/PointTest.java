package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to02then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist, is(2.0));
    }

    @Test
    public void when00to00then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        assertThat(dist, is(0.0));
    }

    @Test
    public void when00to50then5() {
        Point a = new Point(0, 0);
        Point b = new Point(5, 0);
        double dist = a.distance(b);
        assertThat(dist, is(5.0));
    }

    @Test
    public void when000to000then0() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double dist = a.distance3d(b);
        assertThat(dist, is(0.0));
    }

    @Test
    public void when000to003then3() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 3);
        double dist = a.distance3d(b);
        assertThat(dist, is(3.0));
    }
}