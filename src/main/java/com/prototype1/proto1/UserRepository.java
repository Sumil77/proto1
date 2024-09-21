package com.prototype1.proto1;

import com.prototype1.proto1.User.client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<client, Integer> {
    Optional<client> findUserByPhoneNumber(String phoneNumber);
}
