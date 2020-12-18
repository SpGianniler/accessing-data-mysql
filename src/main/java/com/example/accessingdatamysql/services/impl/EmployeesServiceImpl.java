package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.daos.EmployeesDao;
import com.example.accessingdatamysql.entities.Employees;
import com.example.accessingdatamysql.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesServiceImpl implements EmployeesService {
    @Autowired
    private EmployeesDao employeesDao;

    @Override
    public Employees saveEmployee(Employees employee) {
        return employeesDao.save(employee);
    }

    @Override
    public Employees updateEmployee(Employees employee) {
        return employeesDao.saveAndFlush(employee);
    }

    @Override
    public List<Employees> getAllEmployeesList() {
        return employeesDao.findAll();
    }

    @Override
    public Optional<Employees> getEmployee(int eid) {
        return employeesDao.findById(eid);
    }

    @Override
    public void deleteEmployee(int eid) {
        employeesDao.deleteById(eid);
    }
}
