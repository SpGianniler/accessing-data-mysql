package com.example.accessingdatamysql.services;

import com.example.accessingdatamysql.model.Employees;

import java.util.List;
import java.util.Optional;

public interface EmployeesService {
    Employees saveEmployee(Employees employee);

    Employees updateEmployee(Employees employee);

    List<Employees> getAllEmployeesList();

    Optional<Employees> getEmployee(int eid);

    void deleteEmployee(int eid);

//   List<Employees> getCustomErgazomenoi();
}
