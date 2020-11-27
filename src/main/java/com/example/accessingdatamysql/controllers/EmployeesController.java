package com.example.accessingdatamysql.controllers;

import com.example.accessingdatamysql.entities.Employees;
import com.example.accessingdatamysql.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("employees")
@RestController
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @PostMapping("/add")
    public Employees save(@RequestBody Employees employee){

        return employeesService.saveEmployee(employee);
    }

    @PutMapping("/update")
    public Employees update(@RequestBody Employees employee){return  employeesService.updateEmployee(employee);}

    @GetMapping("/all-employees")
    public List<Employees> getAllEmployees(){return employeesService.getAllEmployeesList();}

    @GetMapping("/employee/{eid}")
    public Optional<Employees> getJob(@PathVariable(name = "eid") int eid){return employeesService.getEmployee(eid);}

    @DeleteMapping("/delete/{eid}")
    public void deleteEmployee(@PathVariable(name = "eid") int eid){employeesService.deleteEmployee(eid);}

}
