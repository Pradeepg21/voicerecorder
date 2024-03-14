package com.hackathon.voicerecorder.controller;

import com.hackathon.voicerecorder.Entity.EmployeeEntity;
import com.hackathon.voicerecorder.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
@PostMapping("/addemployee")
 public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/getemployee")
    public List<EmployeeEntity> getEmployees() {
        return employeeRepository.findAll();
    }
}
