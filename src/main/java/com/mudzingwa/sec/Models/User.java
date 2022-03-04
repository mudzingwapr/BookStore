package com.mudzingwa.sec.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer uid;
	@Column(name ="uname", unique=true,nullable=false, length= 50 )
	private String name;
	@Column(name="password",nullable = false,unique=true,length=50)
	private String password;
	@Column(name="username",unique=true,nullable=false,length=50)
	private String username;
	@Enumerated(EnumType.STRING)
	@Column(name="role",nullable = false)
	private Role role;

}
