package com.project.financeiro_auth_service.config;

import com.project.financeiro_auth_service.adapter.mappers.UserMapper;
import com.project.financeiro_auth_service.application.port.in.UserCreationPort;
import com.project.financeiro_auth_service.application.port.out.PasswordHashService;
import com.project.financeiro_auth_service.application.port.out.UserRepositoryPort;
import com.project.financeiro_auth_service.application.usecase.UserCreationUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public UserMapper userMapper() {
        return new UserMapper();
    }

    @Bean
    public UserCreationPort userCreationPort(
            UserRepositoryPort userRepositoryPort,
            PasswordHashService passwordHashService
    ) {
        return  new UserCreationUseCase(userRepositoryPort, passwordHashService);
    }

}
