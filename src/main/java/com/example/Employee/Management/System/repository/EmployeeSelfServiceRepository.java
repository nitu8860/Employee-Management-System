package com.example.Employee.Management.System.repository;

import com.example.Employee.Management.System.model.EmployeeSelfService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeSelfServiceRepository extends JpaRepository<EmployeeSelfService, Long> {
}