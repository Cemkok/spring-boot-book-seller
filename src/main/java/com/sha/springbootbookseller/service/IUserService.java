package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);
    public Optional<User> findByUsername(String username);

    @Transactional
    void makeAdmin(String username);
}
