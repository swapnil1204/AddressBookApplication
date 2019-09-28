package com.thoughtworks.addressbook.person;

public class Person {
    private String firstName;
    private String lastName;
    private String mobilePhone;
    private Address address;

    public Person(String firstName, String lastName, String mobilePhone, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobilePhone = mobilePhone;
        this.address = address;
    }
}
