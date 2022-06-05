package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.pojo.EmployeeDetails;

public interface EmployeeDetailsServiceInterface 
{
	public boolean addNewEmployee(EmployeeDetails employeeDetails);

	public boolean updateEmployeeDetails(EmployeeDetails employeeDetails);

	public boolean deleteEmployeeByEmployeeId(int employeeId);

	public EmployeeDetails getEmployeeByEmployeeId(int employeeId);

	public List<EmployeeDetails> getAllEmployees();
}
