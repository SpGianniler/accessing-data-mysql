package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.repositories.EmployeesHoursRepo;
import com.example.accessingdatamysql.model.EmployeesHours;
import com.example.accessingdatamysql.model.compositeIDs.EmployeesHoursCID;
import com.example.accessingdatamysql.services.EmployeesHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesHoursServicelmpl implements EmployeesHoursService {
    @Autowired
    private EmployeesHoursRepo employeeshoursRepo;

    @Override
    public EmployeesHours saveEmployeesHours(EmployeesHours employeesHours) {
        return employeeshoursRepo.save(employeesHours);
    }

    @Override
    public EmployeesHours updateEmployeesHours(EmployeesHours employeeshours) {
        return employeeshoursRepo.saveAndFlush(employeeshours);
    }

    @Override
    public List<EmployeesHours> getAllEmployeesHoursList() {
        return employeeshoursRepo.findAll();
    }

    @Override
    public Optional<EmployeesHours> getEmployeesHours(EmployeesHoursCID employeesHoursCID) {
        return employeeshoursRepo.findById(employeesHoursCID);
    }

    @Override
    public void deleteEmployeesHours(EmployeesHoursCID employeesHoursCID) { employeeshoursRepo.deleteById(employeesHoursCID); }
}
