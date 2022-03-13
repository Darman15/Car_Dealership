package com.claim.service;

import com.claim.entity.User;
import com.claim.repository.UserRepository;
import com.claim.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User loginUser(User user) {
        return userRepository.findUserByemailAndpassword(user.getEmail(), user.getUserPassword());
    }

    public List<User> listUsers() {
        return userRepository.findAll();
    }
}
