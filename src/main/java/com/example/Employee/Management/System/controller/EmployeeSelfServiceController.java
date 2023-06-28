package com.example.Employee.Management.System.controller;

import com.example.Employee.Management.System.model.EmployeeSelfService;
import com.example.Employee.Management.System.service.EmployeeSelfServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees/self-service")
public class EmployeeSelfServiceController {
    private final EmployeeSelfServiceService employeeSelfServiceService;

    @Autowired
    public EmployeeSelfServiceController(EmployeeSelfServiceService employeeSelfServiceService) {
        this.employeeSelfServiceService = employeeSelfServiceService;
    }

    @GetMapping("/{id}")
    public EmployeeSelfService getEmployeeDetails(@PathVariable Long id) {
        return employeeSelfServiceService.viewEmployeeDetails(id);
    }

    @PostMapping
    public EmployeeSelfService updateEmployeeDetails(@RequestBody EmployeeSelfService employee) {
        return employeeSelfServiceService.updateEmployeeDetails(employee);
    }
}
