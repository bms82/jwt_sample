package bms.practice.jwt.presentation;

import lombok.Setter;

@Setter
public class LoginResponse {
    private String token;

    private long expiresIn;

    public String getToken() {
        return token;
    }


}
