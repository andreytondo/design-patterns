package br.com.andreytondo.models.address;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Address {

    private String houseNumber;

    private String street;

    private String city;

    private String zipcode;

    private String state;
}
