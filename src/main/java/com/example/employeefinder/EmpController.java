package com.example.employeefinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmpController {

    @Autowired
    private EmployeeService employeeService;

    // Add an employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    // Delete an employee by ID
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployee(id);
    }

    // Get a list of all employees
    @GetMapping
    public List<Employee> listAllEmployees() {
        return employeeService.listAllEmployees();
    }

    // Get a specific employee by ID
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(id);
    }
}
