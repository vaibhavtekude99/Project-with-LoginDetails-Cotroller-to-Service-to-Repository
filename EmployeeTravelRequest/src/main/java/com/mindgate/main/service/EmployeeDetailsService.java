package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.pojo.EmployeeDetails;
import com.mindgate.main.repository.EmployeeDetailsRepositoryInterface;

@Service
public class EmployeeDetailsService implements EmployeeDetailsServiceInterface {

	@Autowired
	EmployeeDetailsRepositoryInterface employeeDetailsRepository;

	@Override
	public boolean addNewEmployee(EmployeeDetails employeeDetails) {
		return employeeDetailsRepository.addNewEmployee(employeeDetails);
	}

	@Override
	public boolean updateEmployeeDetails(EmployeeDetails employeeDetails) {
		return employeeDetailsRepository.updateEmployeeDetails(employeeDetails);
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		return employeeDetailsRepository.deleteEmployeeByEmployeeId(employeeId);
	}

	@Override
	public EmployeeDetails getEmployeeByEmployeeId(int employeeId) {
		return employeeDetailsRepository.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public List<EmployeeDetails> getAllEmployees() {
		return employeeDetailsRepository.getAllEmployees();
	}

}
