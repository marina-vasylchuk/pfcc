package org.mvasylchuk.pfcc.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RefreshAuthTokenRequestDto {
    private String refreshToken;
}
