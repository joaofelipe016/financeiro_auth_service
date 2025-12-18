package com.project.financeiro_auth_service.adapter.out.hash;

import com.project.financeiro_auth_service.application.port.out.PasswordHashService;
import org.springframework.stereotype.Service;

@Service
public class FakeHashPasswordAdapter implements PasswordHashService {
    @Override
    public String hash(String password) {
        return password;
    }
}
