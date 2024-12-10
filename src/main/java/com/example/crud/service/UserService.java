package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.User;
import com.example.crud.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // public Optional<User> getUserByEmail(String email) {
    //     return userRepository.findByEmail(email);
    // }

    public Optional<User> getUserByUid(String uid) {
        return userRepository.findByUid(uid);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, User updatedUser) {
        User user = getUserById(id);
        // ini untuk update ya
        user.setName(updatedUser.getName());
        user.setEmail(updatedUser.getEmail());
        // user.setEmail(updatedUser.getEmail());
        // user.setEmail(updatedUser.getEmail());
        // user.setEmail(updatedUser.getEmail());
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
