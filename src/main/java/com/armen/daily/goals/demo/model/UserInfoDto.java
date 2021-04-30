package com.armen.daily.goals.demo.model;

public class UserInfoDto {

    private String name;
    private String street;

    public UserInfoDto(final String name, final String street) {
        this.name = name;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }
}
