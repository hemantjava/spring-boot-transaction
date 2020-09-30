package com.example.springboottransaction.entity.repository;

import com.example.springboottransaction.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
