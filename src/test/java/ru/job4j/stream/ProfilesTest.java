package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void whenCollectAddress() {
        List<Profile> listOfprofile = List.of(
                new Profile(new Address("Moscow", "Lenin", 1, 1)),
                new Profile(new Address("London", "Street", 100, 500))
        );
        Profiles profiles = new Profiles();
        List<Address> result = profiles.collect(listOfprofile);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("London", "Street", 100, 500));
        expected.add(new Address("Moscow", "Lenin", 1, 1));
        assertThat(result, is(expected));
    }

    @Test
    public void whenCollectUniqueAndSortAddress() {
        List<Profile> listOfprofile = List.of(
                new Profile(new Address("Moscow", "Lenin", 1, 1)),
                new Profile(new Address("London", "Street", 100, 500)),
                new Profile(new Address("London", "Street", 100, 500)),
                new Profile(new Address("Amsterdam", "New Street", 10, 50)),
                new Profile(new Address("Zanzibar", "Old Street", 11, 51))
        );
        Profiles profiles = new Profiles();
        List<Address> result = profiles.collect(listOfprofile);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Amsterdam", "New Street", 10, 50));
        expected.add(new Address("London", "Street", 100, 500));
        expected.add(new Address("Moscow", "Lenin", 1, 1));
        expected.add(new Address("Zanzibar", "Old Street", 11, 51));
        assertThat(result, is(expected));
    }
}