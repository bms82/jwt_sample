package bms.practice.jwt.presentation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignUpDto {

    private String email;

    private String password;

    private String fullName;

}
