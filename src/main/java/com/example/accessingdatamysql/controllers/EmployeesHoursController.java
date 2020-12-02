package com.example.accessingdatamysql.controllers;

import com.example.accessingdatamysql.entities.EmployeesHours;
import com.example.accessingdatamysql.entities.compositeIDs.EmployeesHoursCID;
import com.example.accessingdatamysql.services.EmployeesHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("employees-hours")
@RestController
public class EmployeesHoursController {
    @Autowired
    private EmployeesHoursService employeesHoursService;

    @PostMapping("/add")
    public EmployeesHours saveEmployeesHours(@RequestBody EmployeesHours employeesHours) {return employeesHoursService.saveEmployeesHours(employeesHours);}

    @PutMapping("/update")
    private EmployeesHours updateEmployeesHours(EmployeesHours employeesHours) {return employeesHoursService.updateEmployeesHours(employeesHours);}

    @GetMapping("/all-employees-hours")
    public List<EmployeesHours> getAllEmployeesHour(){
        return employeesHoursService.getAllEmployeesHoursList();
    }

    @GetMapping("/employees-jobs/{key}")
    public Optional<EmployeesHours> getEmployeesHours(@PathVariable(name = "key")EmployeesHoursCID employeesHoursCID) {return  employeesHoursService.getEmployeesHours(employeesHoursCID);}

    @DeleteMapping("/delete/{key}")
    public void deleteEmployeesHours(@PathVariable(name = "key") EmployeesHoursCID employeesHoursCID) {employeesHoursService.deleteEmployeesHours(employeesHoursCID);}
}
