package com.cts.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.spring.dao.UserDao;
import com.cts.spring.dao.UserJpaRepo;
import com.cts.spring.model.UserDetails;
import com.cts.spring.model.Users;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserJpaRepo userjparepo;
	
	public List<UserDetails> getAllUsers()
	{
		List<UserDetails> records= new ArrayList<>();
		userDao.findAll().forEach(records::add);
		return records;
	}

	public UserDetails getUserById(int id) {
		
		return userDao.findById(id).get();
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		userDao.deleteById(id);
	}

	public void addUser(UserDetails userDetails) {
		// TODO Auto-generated method stub
		userDao.save(userDetails);
	}

	public void updateUser(UserDetails userDetails) {
		// TODO Auto-generated method stub
		userDao.save(userDetails);
		
	}
	
	public void addMultipleUser(List<UserDetails> userDetails) {
		// TODO Auto-generated method stub
		userDao.saveAll(userDetails);
		
	}
	////////////////////////////////////////////////////////////////
	//JPA one to one mapping
	public void addUsers(Users users)
	{
		userjparepo.save(users);
	}
	
	
	
	
}
