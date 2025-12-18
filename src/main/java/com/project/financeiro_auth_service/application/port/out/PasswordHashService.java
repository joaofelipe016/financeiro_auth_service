package com.project.financeiro_auth_service.application.port.out;

public interface PasswordHashService {

    String hash(String password);

}
