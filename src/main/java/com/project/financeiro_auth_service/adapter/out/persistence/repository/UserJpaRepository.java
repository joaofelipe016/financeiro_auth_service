package com.project.financeiro_auth_service.adapter.out.persistence.repository;

import com.project.financeiro_auth_service.adapter.out.persistence.entity.UserEntity;
import com.project.financeiro_auth_service.domain.entidade.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserJpaRepository extends JpaRepository<UserEntity, UUID> {
}
