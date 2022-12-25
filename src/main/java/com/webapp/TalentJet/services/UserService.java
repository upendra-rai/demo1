package com.webapp.TalentJet.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.webapp.TalentJet.entities.Users;

@Service
public interface UserService {
	
	public Users createUser(Users users);
	public Users updateUser(Users users);
	public Optional<Users> getUserById(Long userId);
	public List<Users> getAllUsersList();
	public void deleteUser (long userId);

}
