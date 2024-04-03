package br.com.andreytondo.models.address;

import br.com.andreytondo.patterns.creational.builder.address.SimpleAddressBuilder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SimpleAddress extends Address {

    private String description;

    public static SimpleAddressBuilder builder() {
        return new SimpleAddressBuilder();
    }
}
