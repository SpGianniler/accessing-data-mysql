package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.model.Holidays;
import com.example.accessingdatamysql.model.Schedule;
import com.example.accessingdatamysql.repositories.HolidaysRepo;
import com.example.accessingdatamysql.repositories.ScheduleRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ScheduleServiceImplTest {
    @InjectMocks
    private ScheduleServiceImpl scheduleService;

    @Mock
    private ScheduleRepo scheduleRepo;

    private Schedule schedule;
    private Schedule schedule1;
    private List<Schedule> scheduleList = new ArrayList<>();

    @Before
    public void setup(){
        schedule = new Schedule(1,"10/10/10","aaa",1,"sss");
        schedule1 = new Schedule(1,"10/10/10","fff",1,"sss");
        scheduleList = Arrays.asList(schedule,schedule);
    }

    @Test
    public void saveSchedule() {
        when(scheduleRepo.save(schedule)).thenReturn(schedule);
        assertEquals(schedule,scheduleService.saveSchedule(schedule));
    }

    @Test
    public void updateSchedule() {
        when(scheduleRepo.saveAndFlush(schedule1)).thenReturn(schedule1);
        assertEquals(schedule1,scheduleService.updateSchedule(schedule1));
    }

    @Test
    public void getAllScheduleList() {
        when(scheduleRepo.findAll()).thenReturn(scheduleList);
        assertEquals(scheduleList,scheduleService.getAllScheduleList());
    }

    @Test
    public void getSchedule() {
        when(scheduleRepo.findById(1)).thenReturn(java.util.Optional.ofNullable(schedule));
        assertEquals(java.util.Optional.ofNullable(schedule),scheduleService.getSchedule(1));
    }

    @Test
    public void deleteSchedule() {
    }
}