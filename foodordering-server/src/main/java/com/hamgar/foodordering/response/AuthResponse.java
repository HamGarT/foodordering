package com.hamgar.foodordering.response;

import com.hamgar.foodordering.model.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {

    private String jwt;
    private String message;
    private USER_ROLE role;
}
