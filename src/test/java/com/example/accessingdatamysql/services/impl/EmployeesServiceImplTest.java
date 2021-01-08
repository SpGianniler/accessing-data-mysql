package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.repositories.EmployeesRepo;
import com.example.accessingdatamysql.model.Employees;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EmployeesServiceImplTest {
    @InjectMocks
    private EmployeesServiceImpl employeesService;

    @Mock
    private EmployeesRepo employeesRepo;

    private Employees employees;
    private List<Employees> employeesList = new ArrayList<>();

    @Before
    public void setup(){
        employees = new Employees(1,"asa","dd", new Date(),2);
        employeesList = Arrays.asList(employees,employees);
    }

    @org.junit.Test
    public void saveEmployee() {
        when(employeesRepo.save(employees)).thenReturn(employees);
        assertEquals(employees,employeesService.saveEmployee(employees));
    }

    @org.junit.Test
    public void updateEmployee() {
    }

    @org.junit.Test
    public void getAllEmployeesList() {
        when(employeesRepo.findAll()).thenReturn(employeesList);
        assertEquals(employeesList,employeesService.getAllEmployeesList());
    }

    @org.junit.Test
    public void getEmployee() {
    }

    @org.junit.Test
    public void deleteEmployee() {
    }

    @org.junit.Test
    public void getCustomErgazomenoi() {
    }
}