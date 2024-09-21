package com.prototype1.proto1.User;

import com.prototype1.proto1.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping(value = "/req/register", consumes = "application/json")
    public client registerUser(@RequestBody client user) throws Exception {
        user.setPassword((passwordEncoder.encode(user.getPassword())));
        return userRepository.save(user);
    }
}
