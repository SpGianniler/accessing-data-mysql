package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.repositories.EmployeesRepo;
import com.example.accessingdatamysql.model.Employees;
import com.example.accessingdatamysql.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeesRepo employeesRepo;

    @Override
    public Employees saveEmployee(Employees employee) {
        return employeesRepo.save(employee);
    }

    @Override
    public Employees updateEmployee(Employees employee) {
        return employeesRepo.saveAndFlush(employee);
    }

    @Override
    public List<Employees> getAllEmployeesList() {
        return employeesRepo.findAll();
    }

    @Override
    public Optional<Employees> getEmployee(int eid) {
        return employeesRepo.findById(eid);
    }

    @Override
    public void deleteEmployee(int eid) {
        employeesRepo.deleteById(eid);
    }

//    @Override
//    public List<Employees> getCustomErgazomenoi() {
//        return null;
//    }

//    @Override
//    public List<EmployeesCustomDTO> getCustomErgazomenoi() {
////        EntityManager entityManager;
////        List<EmployeesCustomDTO> employeesCustomDTOS = entityManager.createNamedQuery("findAllCustomEmployees");
//
//        return employeesRepo.getCustomErgazomenoi();
//    }
}
