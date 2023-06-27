package com.example.Employee.Management.System.service;

import com.example.Employee.Management.System.model.EmployeeSelfService;
import com.example.Employee.Management.System.repository.EmployeeSelfServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeSelfServiceService {
    private final EmployeeSelfServiceRepository employeeSelfServiceRepository;

    @Autowired
    public EmployeeSelfServiceService(EmployeeSelfServiceRepository employeeSelfServiceRepository) {
        this.employeeSelfServiceRepository = employeeSelfServiceRepository;
    }

    public EmployeeSelfService viewEmployeeDetails(Long id) {
        return employeeSelfServiceRepository.findById(id).orElse(null);
    }

    public EmployeeSelfService updateEmployeeDetails(EmployeeSelfService employee) {
        return employeeSelfServiceRepository.save(employee);
    }
}