package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {
    User findUserById(Long userId);
    Optional<User> findUserByUsername(String username);
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUser(Long userId);
    void update(Long id, User updatedUser);
}
