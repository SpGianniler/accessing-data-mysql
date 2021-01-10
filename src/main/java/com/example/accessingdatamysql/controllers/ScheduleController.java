package com.example.accessingdatamysql.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.accessingdatamysql.model.Schedule;
import com.example.accessingdatamysql.services.ScheduleService;

@RequestMapping("schedule")
@RestController
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @PostMapping("/add")
    public Schedule save(@RequestBody Schedule holiday){
        return scheduleService.saveSchedule(holiday);
    }

    @PutMapping("/update")
    public Schedule update(@RequestBody Schedule holiday) {
        return scheduleService.updateSchedule(holiday);
    }

    @GetMapping("/all")
    public List<Schedule> getAllSchedule(){
        return scheduleService.getAllScheduleList();
    }

    @GetMapping("/schedule/{id}")
    public Optional<Schedule> getSchedule(@PathVariable(name = "id") int id) {
        return scheduleService.getSchedule(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSchedule(@PathVariable(name = "id") int id) {
        scheduleService.deleteSchedule(id);
    }
}
