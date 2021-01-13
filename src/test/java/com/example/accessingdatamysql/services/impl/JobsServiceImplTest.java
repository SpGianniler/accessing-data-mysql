package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.model.Jobs;
import com.example.accessingdatamysql.repositories.JobsRepo;
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
public class JobsServiceImplTest {
    @InjectMocks
    private JobsServiceImpl jobsService;

    @Mock
    private JobsRepo jobsRepo;

    private Jobs jobs;
    private Jobs jobs1;
    private List<Jobs> jobsList = new ArrayList<>();

    @Before
    public void setup(){
        jobs = new Jobs(1,"ddd");
        jobs1 = new Jobs(1,"fff");
        jobsList = Arrays.asList(jobs,jobs);
    }

    @Test
    public void saveJob() {
        when(jobsRepo.save(jobs)).thenReturn(jobs);
        assertEquals(jobs,jobsService.saveJob(jobs));
    }

    @Test
    public void updateJob() {
            when(jobsRepo.saveAndFlush(jobs1)).thenReturn(jobs1);
            assertEquals(jobs1,jobsService.updateJob(jobs1));
    }

    @Test
    public void getAllJobsList() {
            when(jobsRepo.findAll()).thenReturn(jobsList);
            assertEquals(jobsList,jobsService.getAllJobsList());
    }

    @Test
    public void getJob() {
            when(jobsRepo.findById(1)).thenReturn(java.util.Optional.ofNullable(jobs));
            assertEquals(java.util.Optional.ofNullable(jobs),jobsService.getJob(1));
    }

    @Test
    public void deleteJob() {
    }
}