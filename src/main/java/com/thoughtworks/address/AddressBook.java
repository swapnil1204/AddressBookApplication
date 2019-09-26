package com.thoughtworks.address;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Person> people;

    public AddressBook() {
        people = new ArrayList<Person>();
    }

    public void add(Person person) {
        people.add(person);
    }

    public List<Person> get() {
        return new ArrayList<>();
    }

}
