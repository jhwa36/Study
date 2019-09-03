package com.hello.mvc.model.dto;

public class heyDto {
	private String id;
	private String password;
	private String name;
	
	public heyDto() {}
	
	public heyDto(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "아이디 ! : " + id + " 비밀번호 ! :  " + password + " 이름 ! : " + name;
	}
}
