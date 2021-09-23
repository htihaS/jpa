package com.cts.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.spring.model.Users;

public interface UserJpaRepo extends JpaRepository<Users, Integer> {

}
