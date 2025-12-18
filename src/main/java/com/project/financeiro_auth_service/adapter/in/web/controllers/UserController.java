package com.project.financeiro_auth_service.adapter.in.web.controllers;

import com.project.financeiro_auth_service.adapter.in.web.dtos.UserRequestDTO;
import com.project.financeiro_auth_service.adapter.in.web.dtos.UserResponseDTO;
import com.project.financeiro_auth_service.application.dtos.CreateUserCommand;
import com.project.financeiro_auth_service.application.dtos.UserCreatedResponse;
import com.project.financeiro_auth_service.application.port.in.UserCreationPort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserCreationPort userCreationPort;

    public UserController(UserCreationPort userCreationPort) {
        this.userCreationPort = userCreationPort;
    }

    @PostMapping("/")
    public UserResponseDTO createUser(@RequestBody UserRequestDTO userRequestDTO) {

        System.out.println("aaaaaaaaaaaaaaaa " + userRequestDTO.getEmail() + " " + userRequestDTO.getNome());

        CreateUserCommand command = new CreateUserCommand(
                UUID.randomUUID(),
                userRequestDTO.getNome(),
                userRequestDTO.getEmail(),
                userRequestDTO.getSenha()
        );

        UserCreatedResponse response = this.userCreationPort.createUser(command);

        return new UserResponseDTO(
                response.getIdUsuario(),
                response.getNome(),
                response.getEmail()
        );

    }
}
