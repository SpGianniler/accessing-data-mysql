package com.example.accessingdatamysql.controllers;

import com.example.accessingdatamysql.entities.EmployeesHours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RequestMapping("employees_hours")
@RestController
public class EmployeesHoursController {
    @Autowired
    private EmployeesHoursController employeesHourseServise;

    @PostMapping("/add")
    public EmployeesHours saveEmployeesHours(@RequestBody EmployeesHours eid) {
        return employeesHourseServise.saveEmployeesHours(eid);
    }

    @PutMapping("/update")
    private EmployeesHours updateEmployeesHours(EmployeesHours eid) {
        return employeesHourseServise.updateEmployeesHours(eid);
    }

    @GetMapping("/all-emploeeshours")
    public List<EmployeesHours> getAllEmployeesHour(){
        return employeesHourseServise.getAllEmployeesHour();
    }

    @GetMapping("/job/{eid}")
    public Optional<EmployeesHours> getEmployeesHours(@PathVariable(name = "eid") int eid) {
        return  employeesHourseServise.getEmployeesHours(eid);
    }
    @DeleteMapping("/delete/{eid}")
    public void deleteEmployeesHours(@PathVariable(name = "eid") int eid) {
        employeesHourseServise.deleteEmployeesHours(eid);
    }
}
