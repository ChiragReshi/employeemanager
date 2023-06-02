package com.spring.tech.employeemanager.repo;

import com.spring.tech.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{
}
