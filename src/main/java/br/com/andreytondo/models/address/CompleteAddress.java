package br.com.andreytondo.models.address;

import br.com.andreytondo.patterns.creational.builder.address.CompleteAddressBuilder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CompleteAddress extends Address {

    private String country;

    private String neighborhood;

    private String complement;

    private String reference;

    private String latitude;

    private String longitude;

    private String phone;

    private String cellPhone;

    private String email;

    public static CompleteAddressBuilder builder() {
        return new CompleteAddressBuilder();
    }

}
