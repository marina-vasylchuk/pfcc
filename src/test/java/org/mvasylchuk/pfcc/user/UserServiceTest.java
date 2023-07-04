package org.mvasylchuk.pfcc.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mvasylchuk.pfcc.platform.email.EmailService;
import org.mvasylchuk.pfcc.user.dto.AccessTokenDto;
import org.mvasylchuk.pfcc.user.dto.RegisterRequestDto;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @InjectMocks
    private UserService underTest;
    @Mock
    private UserRepository userRepository;
    @Mock
    private EmailService emailService;
    @Mock
    private TokenService tokenService;
    @Mock
    private PasswordEncoder passwordEncoder;

    @Test
    void register() {
        Mockito.when(passwordEncoder.encode(any())).thenReturn("pass");
        Mockito.when(userRepository.save(any())).thenReturn(null);
        Mockito.doNothing().when(emailService).sendEmail(any(), any());
        Mockito.when(tokenService.generateToken(any())).thenReturn("token");

        AccessTokenDto result = underTest.register(new RegisterRequestDto("email", "password"));

        Assertions.assertEquals("token", result.getToken());

    }
}