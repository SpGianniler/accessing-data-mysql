package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.dao.EmployeesHoursDao;
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
    public List<EmployeesHours> getAllEmployeesHoursList() {
        return employeeshoursDao.findAll();
    }

    @Override
    public Optional<EmployeesHours> getEmployeesHours(EmployeesHoursCID employeesHoursCID) {
        return employeeshoursDao.findById(employeesHoursCID);
    }

    @Override
    public void deleteEmployeesHours(EmployeesHoursCID employeesHoursCID) { employeeshoursDao.deleteById(employeesHoursCID); }
}
