package com.example.accessingdatamysql.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accessingdatamysql.repositories.JobsRepo;
import com.example.accessingdatamysql.model.Jobs;
import com.example.accessingdatamysql.services.JobsService;

@Service
public class JobsServiceImpl implements JobsService {

    @Autowired
    private JobsRepo jobsRepo;

    @Override
    public Jobs saveJob(Jobs job){
        return jobsRepo.save(job);
    }

    @Override
    public Jobs updateJob(Jobs job){
        return jobsRepo.saveAndFlush(job);
    }

    @Override
    public List<Jobs> getAllJobsList(){
        return jobsRepo.findAll();
    }

    @Override
    public Optional<Jobs> getJob(int jid)
    {
        return jobsRepo.findById(jid);
    }

    @Override
    public void deleteJob(int jid){
        jobsRepo.deleteById(jid);
    }
}
