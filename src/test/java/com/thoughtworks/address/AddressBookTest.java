package com.thoughtworks.address;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {
    @Test
    public void givenNoPerson_WhenRetrieve_ThenShouldReturnEmptyList() {
        AddressBook addressBook = new AddressBook();
        Assertions.assertEquals(0, addressBook.get().size());
    }

}
