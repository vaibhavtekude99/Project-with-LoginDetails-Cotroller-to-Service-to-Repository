package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.pojo.LoginDetails;
import com.mindgate.main.repository.LoginDetailsRepositoryInterface;

@Service
public class LoginDetailsService implements LoginDetailsServiceInterface {
	@Autowired
	LoginDetailsRepositoryInterface loginDetailsRepository;

	@Override
	public boolean addLoginDetails(LoginDetails loginDetails) {
		System.out.println("In Service");
		System.out.println(loginDetails);
		return loginDetailsRepository.addLoginDetails(loginDetails);
	}

	@Override
	public boolean updateLoginDetails(LoginDetails loginDetails) {
		return loginDetailsRepository.updateLoginDetails(loginDetails);
	}

	@Override
	public boolean deleteLoginDetailsById(int loginId) {
		return loginDetailsRepository.deleteLoginDetailsById(loginId);
	}

	@Override
	public LoginDetails getLoginDetailsById(int loginId) {
		return loginDetailsRepository.getLoginDetailsById(loginId);
	}

	@Override
	public List<LoginDetails> getAllLoginDetails() {
		return loginDetailsRepository.getAllLoginDetails();
	}

}
