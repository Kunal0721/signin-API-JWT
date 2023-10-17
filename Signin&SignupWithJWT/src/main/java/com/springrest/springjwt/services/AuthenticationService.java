package com.springrest.springjwt.services;

import com.springrest.springjwt.dto.JwtAuthenticationResponse;
import com.springrest.springjwt.dto.RefreshTokenRequest;
import com.springrest.springjwt.dto.SignUpRequest;
import com.springrest.springjwt.dto.SigninRequest;
import com.springrest.springjwt.model.User;

public interface AuthenticationService {
	
	User signup(SignUpRequest signUpRequest);
	
	JwtAuthenticationResponse signin(SigninRequest signinRequest);
	
	JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
