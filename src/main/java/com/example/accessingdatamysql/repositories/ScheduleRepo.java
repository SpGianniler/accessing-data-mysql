package com.example.accessingdatamysql.repositories;

import com.example.accessingdatamysql.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepo extends JpaRepository<Schedule, Integer> {
}
