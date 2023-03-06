package dev.spruce.backend.service;

import dev.spruce.backend.model.User;

import java.util.List;

public interface UserService {
    public User addUser(User user);
    public List<User> getAllUsers();
}
