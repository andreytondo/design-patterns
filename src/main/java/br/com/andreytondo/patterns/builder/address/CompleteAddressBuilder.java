package br.com.andreytondo.patterns.builder.address;

import br.com.andreytondo.models.address.Address;
import br.com.andreytondo.models.address.CompleteAddress;

public class CompleteAddressBuilder implements AddressBuilder {

    private final CompleteAddress address = new CompleteAddress();

    @Override
    public CompleteAddress build() {
        return address;
    }

    @Override
    public CompleteAddressBuilder houseNumber(String houseNumber) {
        address.setHouseNumber(houseNumber);
        return this;
    }

    @Override
    public CompleteAddressBuilder street(String street) {
        address.setStreet(street);
        return this;
    }

    @Override
    public CompleteAddressBuilder city(String city) {
        address.setCity(city);
        return this;
    }

    @Override
    public CompleteAddressBuilder zipcode(String zipcode) {
        address.setZipcode(zipcode);
        return this;
    }

    @Override
    public CompleteAddressBuilder state(String state) {
        address.setState(state);
        return this;
    }

    public CompleteAddressBuilder country(String country) {
        address.setCountry(country);
        return this;
    }

    public CompleteAddressBuilder neighborhood(String neighborhood) {
        address.setNeighborhood(neighborhood);
        return this;
    }

    public CompleteAddressBuilder complement(String complement) {
        address.setComplement(complement);
        return this;
    }

    public CompleteAddressBuilder reference(String reference) {
        address.setReference(reference);
        return this;
    }

    public CompleteAddressBuilder latitude(String latitude) {
        address.setLatitude(latitude);
        return this;
    }

    public CompleteAddressBuilder longitude(String longitude) {
        address.setLongitude(longitude);
        return this;
    }

    public CompleteAddressBuilder phone(String phone) {
        address.setPhone(phone);
        return this;
    }

    public CompleteAddressBuilder cellPhone(String cellPhone) {
        address.setCellPhone(cellPhone);
        return this;
    }

    public CompleteAddressBuilder email(String email) {
        address.setEmail(email);
        return this;
    }

}
