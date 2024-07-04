package com.ns.demo_jwt.auth;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegisterRequest {
    String username;
    String password;
    String firstname;
    String lastname;
    String country;
}
