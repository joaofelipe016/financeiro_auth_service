package com.project.financeiro_auth_service.adapter.mappers;

import com.project.financeiro_auth_service.adapter.out.persistence.entity.UserEntity;
import com.project.financeiro_auth_service.domain.entidade.User;
import com.project.financeiro_auth_service.domain.vos.EmailAddress;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserEntity toEntity(User user) {
        return new UserEntity(
                user.getIdUser(),
                user.getNome(),
                user.getEmailAddress().toString(),
                user.getSenha()
        );
    }

    public User toDomain(UserEntity userEntity) {
        return User.createNewUser(
                userEntity.getIdUsuario(),
                userEntity.getNome(),
                new EmailAddress(userEntity.getEmail()),
                userEntity.getSenha()
        );
    }
}
