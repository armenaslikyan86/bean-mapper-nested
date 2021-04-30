package com.armen.daily.goals.demo.dto;

public class AddressCreationRequestDto {

    private String city;
    private String street;

    public AddressCreationRequestDto(final String city, final String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }
}
