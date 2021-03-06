package com.example.accessingdatamysql.services;

import com.example.accessingdatamysql.model.EmployeesHours;
import com.example.accessingdatamysql.model.compositeIDs.EmployeesHoursCID;

import java.util.List;
import java.util.Optional;

public interface EmployeesHoursService {

    EmployeesHours saveEmployeesHours(EmployeesHours employeesHours);

    EmployeesHours updateEmployeesHours(EmployeesHours employeeshours);

    Optional<EmployeesHours> getEmployeesHours(EmployeesHoursCID employeesHoursCID);

    void deleteEmployeesHours(EmployeesHoursCID employeesHoursCID);

    List<EmployeesHours> getAllEmployeesHoursList();
}
