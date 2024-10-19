package ru.lyakhov.MySecondTestAppSpringBoot.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ErrorMessages {
    EMPTY(""),
    VALIDATION("ошибка валидации"),
    UNKNOWN("неподдерживаемая ошибка");

    private final String description;

    ErrorMessages(String description) {
        this.description = description;
    }
    @JsonValue
    public String getName() {
        return description;
    }
}
