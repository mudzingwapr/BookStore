package com.mudzingwa.sec.Service.InterfaceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mudzingwa.sec.Models.Role;
import com.mudzingwa.sec.Models.User;
import com.mudzingwa.sec.Repository.UserRepository;
import com.mudzingwa.sec.Service.IUserServiceIntef;
@Service
public class UserServiceImple implements IUserServiceIntef {
	@Autowired
	private UserRepository userrepo;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User saveUser(User user) {
		user.setRole(Role.USER);
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		return userrepo.save(user);
	}

	@Override
	public List<User> findAllUser() {

		return userrepo.findAll();
	}

	@Override
	public void deleteUser(Integer uid) {
		userrepo.deleteById(uid);

	}
	
	@Override
	public Optional<User> findByName(String user) {
		
		return userrepo.findByUsername(user);
	}

	@Override
	public void updateUserRole(User us) {
		// TODO Auto-generated method stub
		userrepo.updateUserRole(us.getName(),Role.ADMIN);
	}

}
