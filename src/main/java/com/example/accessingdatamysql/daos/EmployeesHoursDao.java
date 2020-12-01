package com.example.accessingdatamysql.daos;

import com.example.accessingdatamysql.entities.EmployeesHours;
import com.example.accessingdatamysql.entities.compositeIDs.EmployeesHoursCID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesHoursDao extends JpaRepository<EmployeesHours, EmployeesHoursCID> {
}
