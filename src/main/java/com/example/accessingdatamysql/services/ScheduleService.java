package com.example.accessingdatamysql.services;

import com.example.accessingdatamysql.model.Schedule;

import java.util.List;
import java.util.Optional;

public interface ScheduleService {

    Schedule saveSchedule(Schedule schedule);

    Schedule updateSchedule(Schedule schedule);

    List<Schedule> getAllScheduleList();

    Optional<Schedule> getSchedule(int id);

    void deleteSchedule(int id);
}
