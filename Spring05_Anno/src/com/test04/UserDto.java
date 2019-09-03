package com.test04;


import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("userdto")
public class UserDto {
	
	private String name;
	
	public UserDto() {}
	public UserDto(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
