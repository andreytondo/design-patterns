package br.com.andreytondo.patterns.creational.simplefactory;

import br.com.andreytondo.enums.AccessType;
import br.com.andreytondo.models.user.ConsoleUser;
import br.com.andreytondo.models.user.MobileUser;
import br.com.andreytondo.models.user.User;
import br.com.andreytondo.models.user.WebsiteUser;

import java.util.Objects;

public class UserFactory {

    public static User createUser(AccessType accessType) {
        Objects.requireNonNull(accessType, "User access type should not be null");
        switch (accessType){
            case MOBILE -> {return new MobileUser();}
            case WEBSITE -> {return new WebsiteUser();}
            case CONSOLE -> {return new ConsoleUser();}
            default -> {return null;}
        }
    }
}
