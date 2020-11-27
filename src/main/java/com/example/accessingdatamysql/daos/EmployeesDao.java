package com.example.accessingdatamysql.daos;

import com.example.accessingdatamysql.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesDao extends JpaRepository<Employees, Integer> {
}
