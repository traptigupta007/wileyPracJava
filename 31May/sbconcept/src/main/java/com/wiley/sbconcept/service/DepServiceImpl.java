package com.wiley.sbconcept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.sbconcept.model.Department;
import com.wiley.sbconcept.repository.DepRepo;

@Service
public class DepServiceImpl implements DepService {
	@Autowired
	private DepRepo depRepo;
	@Override
	public Department createDepartment(Department dep) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> getAllDepartmentsList() {
		// TODO Auto-generated method stub
		return depRepo.findAll();
	}

	@Override
	public Department getDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delDepartment(Long departmentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department updateDepartment(Long departmentId, Department dep) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department getDepByName(String depName) {
		// TODO Auto-generated method stub
		return null;
	}

}
