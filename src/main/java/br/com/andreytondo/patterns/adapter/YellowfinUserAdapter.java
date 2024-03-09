package br.com.andreytondo.patterns.adapter;

import br.com.andreytondo.models.user.User;
import br.com.andreytondo.models.yellowfin.YellowfinUser;
import br.com.andreytondo.utils.StringUtils;

public class YellowfinUserAdapter extends User {

    private final YellowfinUser yellowfinUser = new YellowfinUser();

    public YellowfinUserAdapter adapt(User user) {
        yellowfinUser.setUserId(user.getId().toString());
        yellowfinUser.setFirstName(user.getName());
        yellowfinUser.setPassword(user.getPassword());

        yellowfinUser.setEmailAddress(generateEmailAddress(yellowfinUser.getFirstName(), yellowfinUser.getUserId()));
        yellowfinUser.setRoleCode("USER");
        yellowfinUser.setLastName("API_GEN");
        return this;
    }

    public YellowfinUser get() {
        return yellowfinUser;
    }

    public String generateEmailAddress(String firstName, String userId) {
        String[] nameParts = StringUtils.splitName(firstName);
        return nameParts[0].toLowerCase() + "." + userId + "@company.com";
    }
}