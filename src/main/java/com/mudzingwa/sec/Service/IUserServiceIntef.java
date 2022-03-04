package com.mudzingwa.sec.Service;

import java.util.List;
import java.util.Optional;

import com.mudzingwa.sec.Models.User;


 
public interface IUserServiceIntef {
	
	public User saveUser(User user);
	public List<User>findAllUser();
	public Optional<User> findByName(String user);
	public void deleteUser(Integer uid);
	public void updateUserRole(User us);
	

}
