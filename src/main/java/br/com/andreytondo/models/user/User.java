package br.com.andreytondo.models.user;

import br.com.andreytondo.models.address.Address;
import br.com.andreytondo.patterns.creational.builder.user.UserBuilder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class User {

    private Long id;

    private String name;

    private String password;

    private LocalDate createdAt;

    private Address address;

    public static UserBuilder builder() {
        return new UserBuilder();
    }
}
