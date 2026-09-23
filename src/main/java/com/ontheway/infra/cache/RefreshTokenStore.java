package com.ontheway.infra.cache;

public interface RefreshTokenStore {
    void save(String accountId, String refreshToken);
    TokenValidationResult validate(String accountId, String refreshToken);
    void delete(String accountId);
}
