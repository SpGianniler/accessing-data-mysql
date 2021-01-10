package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.model.Schedule;
import com.example.accessingdatamysql.repositories.ScheduleRepo;
import com.example.accessingdatamysql.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleRepo scheduleRepo;


    @Override
    public Schedule saveSchedule(Schedule schedule) {
        return scheduleRepo.save(schedule);
    }

    @Override
    public Schedule updateSchedule(Schedule schedule) {
        return scheduleRepo.saveAndFlush(schedule);
    }

    @Override
    public List<Schedule> getAllScheduleList() {
        return scheduleRepo.findAll();
    }

    @Override
    public Optional<Schedule> getSchedule(int id) {
        return scheduleRepo.findById(id);
    }

    @Override
    public void deleteSchedule(int id) {
        scheduleRepo.deleteById(id);
    }
}
