package com.mindgate.main.pojo;

import org.springframework.stereotype.Component;

@Component
public class LoginDetails {
    
	private int loginId;
	private String password;
	private String role;
	
	public LoginDetails() {
		// TODO Auto-generated constructor stub
	}

	public LoginDetails(int loginId, String password, String role) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.role = role;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString()
	{
		return "LoginDetails [loginId=" + loginId + ", password=" + password + ", role=" + role + "]";
	}
	
	
	
}
