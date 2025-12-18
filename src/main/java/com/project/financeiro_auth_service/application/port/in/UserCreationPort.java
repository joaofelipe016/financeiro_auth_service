package com.project.financeiro_auth_service.application.port.in;

import com.project.financeiro_auth_service.application.dtos.CreateUserCommand;
import com.project.financeiro_auth_service.application.dtos.UserCreatedResponse;

public interface UserCreationPort {

    UserCreatedResponse createUser(CreateUserCommand createUserCommand);

}
