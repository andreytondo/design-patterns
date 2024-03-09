package br.com.andreytondo.utils;

import lombok.NonNull;

public class StringUtils {

    public static String[] splitName(@NonNull String name) {
        String trimmedName = name.trim();
        if (trimmedName.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        return trimmedName.split(" ");
    }
}
