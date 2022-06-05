package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.pojo.LoginDetails;

public interface LoginDetailsServiceInterface
{
	
	 public boolean addLoginDetails(LoginDetails loginDetails);
     public boolean updateLoginDetails(LoginDetails loginDetails);
     public boolean deleteLoginDetailsById(int loginId);
     public LoginDetails getLoginDetailsById(int loginId);
     public List<LoginDetails> getAllLoginDetails();

}
