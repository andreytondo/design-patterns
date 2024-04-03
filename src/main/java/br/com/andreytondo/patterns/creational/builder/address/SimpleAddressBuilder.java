package br.com.andreytondo.patterns.creational.builder.address;

import br.com.andreytondo.models.address.SimpleAddress;

public class SimpleAddressBuilder implements AddressBuilder {

    private final SimpleAddress address = new SimpleAddress();

    @Override
    public SimpleAddress build() {
        return address;
    }

    @Override
    public SimpleAddressBuilder houseNumber(String houseNumber) {
        address.setHouseNumber(houseNumber);
        return this;
    }

    @Override
    public SimpleAddressBuilder street(String street) {
        address.setStreet(street);
        return this;
    }

    @Override
    public SimpleAddressBuilder city(String city) {
        address.setCity(city);
        return this;
    }

    @Override
    public SimpleAddressBuilder zipcode(String zipcode) {
        address.setZipcode(zipcode);
        return this;
    }

    @Override
    public SimpleAddressBuilder state(String state) {
        address.setState(state);
        return this;
    }

    public SimpleAddressBuilder description(String description) {
        address.setDescription(description);
        return this;
    }
}
