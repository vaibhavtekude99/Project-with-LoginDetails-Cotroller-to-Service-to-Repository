package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.pojo.EmployeeDetails;

public interface EmployeeDetailsRepositoryInterface {

	public boolean addNewEmployee(EmployeeDetails employeeDetails);

	public boolean updateEmployeeDetails(EmployeeDetails employeeDetails);

	public boolean deleteEmployeeByEmployeeId(int employeeId);

	public EmployeeDetails getEmployeeByEmployeeId(int employeeId);

	public List<EmployeeDetails> getAllEmployees();

}
