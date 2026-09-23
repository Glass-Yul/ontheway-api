package com.ontheway.dto.response;

import lombok.Builder;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
@Builder
public class TokenRenewResponseDto {
    private String refreshToken;
    private LocalDateTime createdAt;
}