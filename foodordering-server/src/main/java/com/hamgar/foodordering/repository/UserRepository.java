package com.hamgar.foodordering.repository;

import com.hamgar.foodordering.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


    public User findByEmail(String username);

}
