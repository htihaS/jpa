package com.cts.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.spring.model.UserDetails;

public interface UserDao extends CrudRepository<UserDetails,Integer>{

}
