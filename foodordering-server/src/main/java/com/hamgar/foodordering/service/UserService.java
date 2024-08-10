package com.hamgar.foodordering.service;

import com.hamgar.foodordering.model.User;

public interface UserService {

    public User findUserByJwtToken(String jwt) throws Exception;

    public User findUserByEmail(String email) throws  Exception;

}
