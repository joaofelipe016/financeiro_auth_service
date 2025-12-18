package com.project.financeiro_auth_service.adapter.in.web.dtos;

import java.util.UUID;

public class UserRequestDTO {

    private String nome;
    private String email;
    private String senha;

    public UserRequestDTO(UUID idUsuario, String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
