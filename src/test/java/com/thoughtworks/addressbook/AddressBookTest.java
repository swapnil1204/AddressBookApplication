package com.thoughtworks.addressbook;

import com.thoughtworks.addressbook.person.Address;
import com.thoughtworks.addressbook.person.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddressBookTest {
    @Test
    public void givenNoPerson_WhenRetrieve_ThenShouldNotReturnAnyPerson() {
        AddressBook addressBook = new AddressBook();
        assertEquals(0, addressBook.get().size());
    }

    @Test
    public void givenOnePerson_WhenRetrieve_ThenShouldReturnOnePerson() {
        Address address = new Address("HSR layout", "Bengluru", "India", "445001");
        Person person = new Person("Swapnil", "Bamb", "8976542345", address);

        AddressBook addressBook = new AddressBook();
        addressBook.add(person);

        assertEquals(1, addressBook.get().size());
    }

    @Test
    public void givenTwoPerson_WhenRetrieve_ThenShouldReturnTwoPerson() {
        Address rajAddress = new Address("HSR layout", "Bengluru", "India", "445001");
        Person Raj = new Person("Raj", "Bamb", "8976542345", rajAddress);
        Address apurvaAddress = new Address("HSR layout", "Bengluru", "India", "445001");
        Person Apurva = new Person("Raj", "Bamb", "8976542345", apurvaAddress);

        AddressBook addressBook = new AddressBook();
        addressBook.add(Raj);
        addressBook.add(Apurva);

        assertEquals(2, addressBook.get().size());
        assertEquals(Raj,addressBook.get().get(0));
        assertEquals(Apurva,addressBook.get().get(1));
    }

}
