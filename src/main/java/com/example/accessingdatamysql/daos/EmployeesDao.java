package com.example.accessingdatamysql.daos;

import com.example.accessingdatamysql.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesDao extends JpaRepository<Employees, Integer> {
}
