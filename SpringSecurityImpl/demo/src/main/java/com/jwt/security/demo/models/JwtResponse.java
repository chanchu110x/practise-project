package com.jwt.security.demo.models;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JwtResponse {
	private String jwtToken;
	private String userName;
}
