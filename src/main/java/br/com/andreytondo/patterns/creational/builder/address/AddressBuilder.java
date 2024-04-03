package br.com.andreytondo.patterns.creational.builder.address;

import br.com.andreytondo.models.address.Address;

public interface AddressBuilder {

    Address build();

    AddressBuilder houseNumber(String houseNumber);

    AddressBuilder street(String street);

    AddressBuilder city(String city);

    AddressBuilder zipcode(String zipcode);

    AddressBuilder state(String state);
}
