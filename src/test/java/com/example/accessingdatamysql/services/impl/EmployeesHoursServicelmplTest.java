package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.model.EmployeesHours;
import com.example.accessingdatamysql.model.compositeIDs.EmployeesHoursCID;
import com.example.accessingdatamysql.repositories.EmployeesHoursRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EmployeesHoursServicelmplTest {
    @InjectMocks
    private EmployeesHoursServicelmpl employeesHoursServicelmpl;

    @Mock
    private EmployeesHoursRepo employeesHoursRepo;

    private EmployeesHours employeesHours;
    private EmployeesHours employeesHours1;
    private EmployeesHoursCID employeesHoursCID;
    private List<EmployeesHours> employeesHoursList = new ArrayList<>();

    @Before
    public void setup(){
        employeesHours = new EmployeesHours(1,1,1);
        employeesHours1 = new EmployeesHours(1,1,2);
        employeesHoursCID = new EmployeesHoursCID(1,1);
        employeesHoursList = Arrays.asList(employeesHours,employeesHours);
    }

    @Test
    public void saveEmployeesHours() {
        when(employeesHoursRepo.save(employeesHours)).thenReturn(employeesHours);
        assertEquals(employeesHours,employeesHoursServicelmpl.saveEmployeesHours(employeesHours));
    }

    @Test
    public void updateEmployeesHours() {
        when(employeesHoursRepo.saveAndFlush(employeesHours1)).thenReturn(employeesHours1);
        assertEquals(employeesHours1,employeesHoursServicelmpl.updateEmployeesHours(employeesHours1));
    }

    @Test
    public void getAllEmployeesHoursList() {
        when(employeesHoursRepo.findAll()).thenReturn(employeesHoursList);
        assertEquals(employeesHoursList,employeesHoursServicelmpl.getAllEmployeesHoursList());
    }

    @Test
    public void getEmployeesHours() {
        when(employeesHoursRepo.findById(employeesHoursCID)).thenReturn(java.util.Optional.ofNullable(employeesHours));
        assertEquals(java.util.Optional.ofNullable(employeesHours),employeesHoursServicelmpl.getEmployeesHours(employeesHoursCID));
    }

    @Test
    public void deleteEmployeesHours() {
    }
}