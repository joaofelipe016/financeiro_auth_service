package com.project.financeiro_auth_service.application.dtos;

import java.util.UUID;

public class CreateUserCommand {

    private UUID idUsuario;
    private String nome;
    private String email;
    private String senha;

    public CreateUserCommand(UUID idUsuario, String nome, String email, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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

    public String getSenha() {
        return senha;
    }

}
