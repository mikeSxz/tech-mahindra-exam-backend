package com.msuarez.springboot.rest.example.user.service;

import com.msuarez.springboot.rest.example.user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    Page<User> getAllUsers(Pageable pageable);
    User getUserById(Long id);
    User createUser(User User);
    User updateUser(Long id, User User);
    void deleteUser(Long id);
}
