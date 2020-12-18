package com.example.accessingdatamysql.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accessingdatamysql.dao.JobsDao;
import com.example.accessingdatamysql.model.Jobs;
import com.example.accessingdatamysql.services.JobsService;

@Service
public class JobsServiceImpl implements JobsService {

    @Autowired
    private JobsDao jobsDao;

    @Override
    public Jobs saveJob(Jobs job){
        return jobsDao.save(job);
    }

    @Override
    public Jobs updateJob(Jobs job){
        return jobsDao.saveAndFlush(job);
    }

    @Override
    public List<Jobs> getAllJobsList(){
        return jobsDao.findAll();
    }

    @Override
    public Optional<Jobs> getJob(int jid)
    {
        return jobsDao.findById(jid);
    }

    @Override
    public void deleteJob(int jid){
        jobsDao.deleteById(jid);
    }
}
