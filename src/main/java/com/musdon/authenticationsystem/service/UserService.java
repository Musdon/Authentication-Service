package com.musdon.authenticationsystem.service;

import com.musdon.authenticationsystem.dto.LoginRequest;
import com.musdon.authenticationsystem.dto.Request;
import com.musdon.authenticationsystem.dto.Response;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<Response> signup(Request request);
    ResponseEntity<Response> login(LoginRequest request);
    Response sendOtp();
    Response validateOtp();
    Response resetPassword();
    Response changePassword();
}
