package br.com.andreytondo.patterns.creational.builder.user;

import br.com.andreytondo.models.address.Address;
import br.com.andreytondo.models.user.User;

import java.time.LocalDate;

public class UserBuilder {

    private static final User user = new User();

    public UserBuilder id(Long id) {
        user.setId(id);
        return this;
    }

    public UserBuilder name(String name) {
        user.setName(name);
        return this;
    }

    public UserBuilder password(String password) {
        user.setPassword(password);
        return this;
    }

    public UserBuilder createdAt(LocalDate createdAt) {
        user.setCreatedAt(createdAt);
        return this;
    }

    public UserBuilder address(Address address) {
        user.setAddress(address);
        return this;
    }

    public User build() {
        return user;
    }
}
