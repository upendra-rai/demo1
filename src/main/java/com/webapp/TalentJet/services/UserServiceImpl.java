package com.webapp.TalentJet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.TalentJet.entities.Users;
import com.webapp.TalentJet.repositories.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public Users createUser(Users users) {
		
		return userRepository.save(users);
	}

	@Override
	public Users updateUser(Users users) {
		
		return userRepository.save(users);
	}

	@Override
	public Optional<Users> getUserById(Long userId) {
		
		return userRepository.findById(userId);
	}

	@Override
	public void deleteUser(long userId) {
		
		userRepository.deleteById(userId);
		
	}

	@Override
	public List<Users> getAllUsersList() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	

}
