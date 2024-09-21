package com.prototype1.proto1.User;

import com.prototype1.proto1.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String Phno) throws UsernameNotFoundException {
        client user = userRepository.findUserByPhoneNumber((Phno))
                .orElseThrow(() -> new UsernameNotFoundException(""));
        return new CustomUserDetails(user);
    }
}
