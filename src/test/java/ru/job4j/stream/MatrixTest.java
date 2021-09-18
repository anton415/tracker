package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {

    @Test
    public void whenConvertMatrixToList() {
        Integer[][] integers = new Integer[][]{{1, 2}, {3, 4}};
        List<Integer> result = Matrix.matrixToList(integers);
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertThat(result, is(expected));
    }
}