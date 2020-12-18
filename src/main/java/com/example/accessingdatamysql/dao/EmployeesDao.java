package com.example.accessingdatamysql.dao;

import com.example.accessingdatamysql.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesDao extends JpaRepository<Employees, Integer> {
}