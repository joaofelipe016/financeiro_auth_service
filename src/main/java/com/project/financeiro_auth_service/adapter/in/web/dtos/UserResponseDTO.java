package com.project.financeiro_auth_service.adapter.in.web.dtos;

import java.util.UUID;

public class UserResponseDTO {

    private UUID idUsuario;
    private String nome;
    private String email;

    public UserResponseDTO(UUID idUsuario, String nome, String email) {
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
