package com.thoughtworks.addressbook;

import com.thoughtworks.addressbook.person.Address;
import com.thoughtworks.addressbook.person.Person;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Person> people;

    public AddressBook() {
        people = new ArrayList<>();
    }

    public void add(Person person) {
        people.add(person);
    }

    public List<Person> get() {
        return people;
    }

}
