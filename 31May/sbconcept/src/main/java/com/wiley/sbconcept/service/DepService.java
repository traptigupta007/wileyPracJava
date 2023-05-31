package com.wiley.sbconcept.service;

import java.util.List;

import com.wiley.sbconcept.model.Department;

public interface DepService {
	public Department createDepartment(Department dep);
	public List<Department> getAllDepartmentsList();
	public Department getDepartmentById(Long departmentId);
	public void delDepartment(Long departmentId);
	public Department updateDepartment(Long departmentId,Department dep);
	Department getDepByName(String depName);
}
