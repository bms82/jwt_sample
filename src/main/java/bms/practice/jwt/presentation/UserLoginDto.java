package bms.practice.jwt.presentation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginDto {

    private String email;

    private String password;

}
