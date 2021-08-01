package com.codecool.pantry.registration;

import lombok.*;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class RegistrationRequest {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
}
