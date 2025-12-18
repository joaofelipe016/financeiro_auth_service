package com.project.financeiro_auth_service.adapter.out.persistence;

import com.project.financeiro_auth_service.adapter.mappers.UserMapper;
import com.project.financeiro_auth_service.adapter.out.persistence.entity.UserEntity;
import com.project.financeiro_auth_service.adapter.out.persistence.repository.UserJpaRepository;
import com.project.financeiro_auth_service.application.port.out.UserRepositoryPort;
import com.project.financeiro_auth_service.domain.entidade.User;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserRepositoryAdapter implements UserRepositoryPort {

    private final UserJpaRepository userJpaRepository;
    private final UserMapper userMapper;

    public JpaUserRepositoryAdapter(UserJpaRepository userJpaRepository, UserMapper userMapper) {
        this.userJpaRepository = userJpaRepository;
        this.userMapper = userMapper;
    }

    @Override
    public void save(User user) {

        UserEntity userEntity = userMapper.toEntity(user);

        userJpaRepository.save(userEntity);

    }

}
