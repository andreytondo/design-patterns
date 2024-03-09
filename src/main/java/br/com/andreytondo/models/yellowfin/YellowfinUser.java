package br.com.andreytondo.models.yellowfin;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class YellowfinUser {

    private String userId;
    private String emailAddress;
    private String roleCode;
    private String password;
    private String firstName;
    private String lastName;
}