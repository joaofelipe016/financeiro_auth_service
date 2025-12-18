package com.project.financeiro_auth_service.domain.vos;

public final class EmailAddress {

    private final String value;

    public EmailAddress(String value) {

        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("Email é um campo obrigatorio");
        }

        if(!isValueFormat(value)) {
            throw new IllegalArgumentException("Email não é valido");
        }

        this.value = value.toLowerCase();

    }

    private boolean isValueFormat(String value) {
        if(value.contains("@")) {
            return true;
        }

        return false;
    }

    public String getValue() {
        return value;
    }

}
