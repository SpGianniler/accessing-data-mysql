package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.model.ShiftsJobs;
import com.example.accessingdatamysql.model.compositeIDs.ShiftsJobsCID;
import com.example.accessingdatamysql.repositories.ShiftsjobsRepo;
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
public class ShiftsJobsServicelmplTest {
    @InjectMocks
    private ShiftsJobsServicelmpl shiftsJobsServicelmpl;

    @Mock
    private ShiftsjobsRepo shiftsjobsRepo;

    private ShiftsJobs shiftsJobs;
    private ShiftsJobs shiftsJobs1;
    private ShiftsJobsCID shiftsJobsCID;
    private List<ShiftsJobs> shiftsJobsList = new ArrayList<>();

    @Before
    public void setup(){
        shiftsJobs = new ShiftsJobs(1,1,1);
        shiftsJobs1 = new ShiftsJobs(1,1,2);
        shiftsJobsCID = new ShiftsJobsCID(1,1);
        shiftsJobsList = Arrays.asList(shiftsJobs,shiftsJobs);
    }

    @Test
    public void saveShiftsJobs() {
        when(shiftsjobsRepo.save(shiftsJobs)).thenReturn(shiftsJobs);
        assertEquals(shiftsJobs,shiftsJobsServicelmpl.saveShiftsJobs(shiftsJobs));
    }

    @Test
    public void updateshiftsJobs() {
        when(shiftsjobsRepo.saveAndFlush(shiftsJobs1)).thenReturn(shiftsJobs1);
        assertEquals(shiftsJobs1,shiftsJobsServicelmpl.updateshiftsJobs(shiftsJobs1));
    }

    @Test
    public void getAllShiftsJobsList() {
        when(shiftsjobsRepo.findAll()).thenReturn(shiftsJobsList);
        assertEquals(shiftsJobsList,shiftsJobsServicelmpl.getAllShiftsJobsList());
    }

    @Test
    public void getshiftsJobs() {
        when(shiftsjobsRepo.findById(shiftsJobsCID)).thenReturn(java.util.Optional.ofNullable(shiftsJobs));
        assertEquals(java.util.Optional.ofNullable(shiftsJobs),shiftsJobsServicelmpl.getshiftsJobs(shiftsJobsCID));
    }

    @Test
    public void deleteshiftsJobs() {
    }
}