package com.project.financeiro_auth_service.domain.entidade;

import com.project.financeiro_auth_service.domain.vos.EmailAddress;

import java.util.UUID;

public class User {

    private final UUID idUser;
    private final String nome;
    private final EmailAddress emailAddress;
    private final String senha;

    private User(UUID idUser, String nome, EmailAddress emailAddress, String senha) {
        validar(nome, senha);
        this.idUser = idUser;
        this.nome = nome;
        this.emailAddress = emailAddress;
        this.senha = senha;
    }

    private void validar(String nome, String senha) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O campo nome é obrigatório");
        }

        if (senha.length() < 8) {
            throw new IllegalArgumentException("A senha é inválida. A senha tem menos de 8 caracteres");
        }
    }

    public static User createNewUser(UUID idUser, String nome, EmailAddress emailAddress, String senha) {
        return new User(idUser, nome, emailAddress, senha);
    }

    public UUID getIdUser() {
        return idUser;
    }

    public String getNome() {
        return nome;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public String getSenha() {
        return senha;
    }
}
