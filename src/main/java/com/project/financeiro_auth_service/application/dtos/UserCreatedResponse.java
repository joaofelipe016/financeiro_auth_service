package com.project.financeiro_auth_service.application.dtos;

import java.util.UUID;

public class UserCreatedResponse {

    private final UUID idUsuario;
    private final String nome;
    private final String email;

    public UserCreatedResponse(UUID idUsuario, String nome, String email) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
