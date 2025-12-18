package com.project.financeiro_auth_service.application.port.out;

import com.project.financeiro_auth_service.domain.entidade.User;

public interface UserRepositoryPort {

    void save(User user);

}
