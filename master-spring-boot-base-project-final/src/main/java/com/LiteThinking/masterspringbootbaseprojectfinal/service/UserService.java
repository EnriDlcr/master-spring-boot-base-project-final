package com.LiteThinking.masterspringbootbaseprojectfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.LiteThinking.masterspringbootbaseprojectfinal.repository.UserRepository;
import com.LiteThinking.masterspringbootbaseprojectfinal.domain.User;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Otros métodos de servicio
}

