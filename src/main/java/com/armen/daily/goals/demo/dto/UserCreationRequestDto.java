package com.armen.daily.goals.demo.dto;

public class UserCreationRequestDto {

    private String name;
    private int age;
    private AddressCreationRequestDto addressCreationRequestDto;

    public UserCreationRequestDto(final String name, final int age, final AddressCreationRequestDto addressCreationRequestDto) {
        this.name = name;
        this.age = age;
        this.addressCreationRequestDto = addressCreationRequestDto;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public AddressCreationRequestDto getAddressCreationRequestDto() {
        return addressCreationRequestDto;
    }

    public void setAddressCreationRequestDto(final AddressCreationRequestDto addressCreationRequestDto) {
        this.addressCreationRequestDto = addressCreationRequestDto;
    }
}
