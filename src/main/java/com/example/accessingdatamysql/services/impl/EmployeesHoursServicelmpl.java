package com.example.accessingdatamysql.services.impl;


import com.example.accessingdatamysql.daos.EmployeesHoursDao;
import com.example.accessingdatamysql.entities.EmployeesHours;
import com.example.accessingdatamysql.entities.compositeIDs.EmployeesHoursCID;
import com.example.accessingdatamysql.services.EmployeesHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesHoursServicelmpl implements EmployeesHoursService {

    @Autowired
    private EmployeesHoursDao employeeshoursDao;

    @Override
    public EmployeesHours saveEmployeesHours(EmployeesHours employeesHours) {
        return employeeshoursDao.save(employeesHours);
    }

    @Override
    public EmployeesHours updateEmployeesHours(EmployeesHours employeeshours) {
        return employeeshoursDao.saveAndFlush(employeeshours);
    }

    @Override
    public Optional<EmployeesHours> getEmployeesHours(EmployeesHoursCID employeesHoursCID) {
        return Optional.empty();
    }

    @Override
    public void deleteEmployeesHours(EmployeesHoursCID employeesHoursCID) {
        employeeshoursDao.deleteById(employeesHoursCID);
    }

    @Override
    public List<EmployeesHours> getEmployeesHoursList() {
        return employeeshoursDao.findAll();
    }

}
