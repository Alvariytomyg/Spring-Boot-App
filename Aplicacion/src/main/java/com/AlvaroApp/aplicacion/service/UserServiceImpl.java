package com.AlvaroApp.aplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AlvaroApp.aplicacion.entity.User;
import com.AlvaroApp.aplicacion.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public Iterable<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
