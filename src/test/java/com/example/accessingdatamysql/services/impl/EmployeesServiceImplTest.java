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
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmployeesServiceImplTest {
    @InjectMocks
    private EmployeesServiceImpl employeesService;

    @Mock
    private EmployeesRepo employeesRepo;

    private Employees employees;
    private Employees employees1;
    private List<Employees> employeesList = new ArrayList<>();

    @Before
    public void setup(){
        employees = new Employees(1,"asa","dd", new Date(),2);
        employees1 = new Employees(1,"ada","cc", new Date(),3);
        employeesList = Arrays.asList(employees,employees);
    }

    @org.junit.Test
    public void saveEmployee() {
        when(employeesRepo.save(employees)).thenReturn(employees);
        assertEquals(employees,employeesService.saveEmployee(employees));
    }

    @org.junit.Test
    public void updateEmployee() {
        when(employeesRepo.saveAndFlush(employees1)).thenReturn(employees1);
        assertEquals(employees1,employeesService.updateEmployee(employees1));
    }

    @org.junit.Test
    public void getAllEmployeesList() {
        when(employeesRepo.findAll()).thenReturn(employeesList);
        assertEquals(employeesList,employeesService.getAllEmployeesList());
    }

    @org.junit.Test
    public void getEmployee() {
        when(employeesRepo.findById(1)).thenReturn(java.util.Optional.ofNullable(employees));
        assertEquals(java.util.Optional.ofNullable(employees),employeesService.getEmployee(1));
    }
}