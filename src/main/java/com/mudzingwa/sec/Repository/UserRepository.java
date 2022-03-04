package com.mudzingwa.sec.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mudzingwa.sec.Models.Role;
import com.mudzingwa.sec.Models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUsername(String uname);
	
	@Modifying
	@Query("update User set role= :role where username =:username")
	void updateUserRole(@Param("username") String username,@Param("role") Role role);
	

}
