package com.thoughtworks.address;

public class Address {
    public String street;
    public String city;
    public String country;
    public String ZipCode;

    public Address(String street, String city, String country, String zipCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.ZipCode = zipCode;
    }
}
