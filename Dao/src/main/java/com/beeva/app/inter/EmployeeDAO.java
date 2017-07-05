package com.beeva.app.inter;

import com.beeva.app.model.Employee;

public interface EmployeeDAO {
	public boolean addEmployee(Employee e);
	public boolean removeEmployee(Employee e);
	public Employee getEmployee(int id);
	

}
