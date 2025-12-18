package com.project.financeiro_auth_service.application.usecase;

import com.project.financeiro_auth_service.application.dtos.CreateUserCommand;
import com.project.financeiro_auth_service.application.dtos.UserCreatedResponse;
import com.project.financeiro_auth_service.application.port.in.UserCreationPort;
import com.project.financeiro_auth_service.application.port.out.PasswordHashService;
import com.project.financeiro_auth_service.application.port.out.UserRepositoryPort;
import com.project.financeiro_auth_service.domain.entidade.User;
import com.project.financeiro_auth_service.domain.vos.EmailAddress;

public class UserCreationUseCase implements UserCreationPort {

    private final UserRepositoryPort userRepositoryPort;
    private final PasswordHashService passwordHashService;

    public UserCreationUseCase(UserRepositoryPort userRepositoryPort, PasswordHashService passwordHashService) {
        this.userRepositoryPort = userRepositoryPort;
        this.passwordHashService = passwordHashService;
    }

    @Override
    public UserCreatedResponse createUser(CreateUserCommand createUserCommand) {

        String password = passwordHashService.hash(createUserCommand.getSenha());

        User user = User.createNewUser(
                createUserCommand.getIdUsuario(),
                createUserCommand.getNome(),
                new EmailAddress(createUserCommand.getEmail()),
                password
        );

        userRepositoryPort.save(user);

        return new UserCreatedResponse(
                createUserCommand.getIdUsuario(),
                createUserCommand.getNome(),
                createUserCommand.getEmail()
        );
    }
}
