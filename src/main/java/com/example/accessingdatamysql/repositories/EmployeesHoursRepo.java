package com.example.accessingdatamysql.repositories;

import com.example.accessingdatamysql.model.EmployeesHours;
import com.example.accessingdatamysql.model.compositeIDs.EmployeesHoursCID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesHoursRepo extends JpaRepository<EmployeesHours, EmployeesHoursCID> {
}
