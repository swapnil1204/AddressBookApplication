package com.thoughtworks.address;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {
    @Test
    public void givenNoPerson_WhenRetrieve_ThenShouldReturnEmptyList() {
        AddressBook addressBook = new AddressBook();
        Assertions.assertEquals(0, addressBook.get().size());
    }
    @Test
    public void givenOnePerson_WhenRetrieve_ThenShouldReturnEmptyList() {
        Address address = new Address("HSR layout","Bengluru","India","445001");
        Person person = new Person("Swapnil","Bamb","8976542345",address);

        AddressBook addressBook = new AddressBook();
        addressBook.add(person);

        Assertions.assertEquals(1, addressBook.get().size());
    }
}
