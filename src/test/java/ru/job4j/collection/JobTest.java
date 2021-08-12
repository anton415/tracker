package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByNameDown()
                .thenComparing(new JobDescByPriorityDown());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityWithSameName() {
        Comparator<Job> cmpNamePriority = new JobDescByNameDown()
                .thenComparing(new JobDescByPriorityDown());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompactorByNameAndPriorityWithSameNameAndDifferentPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByNameDown()
                .thenComparing(new JobDescByPriorityDown());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameUp() {
        Comparator<Job> comparator = new JobDescByNameUp();
        int result = comparator.compare(
                new Job("A", 0),
                new Job("B", 0)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityUp() {
        Comparator<Job> comparator = new JobDescByPriorityUp();
        int result = comparator.compare(
                new Job("A", 0),
                new Job("A", 1)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenComparatorByNameDown() {
        Comparator<Job> comparator = new JobDescByNameDown();
        int result = comparator.compare(
                new Job("A", 0),
                new Job("B", 0)
        );
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenComparatorByPriorityDown() {
        Comparator<Job> comparator = new JobDescByPriorityDown();
        int result = comparator.compare(
                new Job("A", 0),
                new Job("A", 1)
        );
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameUpAndPriorityUp() {
        Comparator<Job> comparator = new JobDescByNameUp().thenComparing(new JobDescByPriorityUp());
        int result = comparator.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result, greaterThan(0));
    }
}