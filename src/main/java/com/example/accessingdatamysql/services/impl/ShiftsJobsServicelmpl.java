package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.dao.ShiftsjobsDao;
import com.example.accessingdatamysql.model.ShiftsJobs;
import com.example.accessingdatamysql.model.compositeIDs.ShiftsJobsCID;
import com.example.accessingdatamysql.services.ShiftsJobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShiftsJobsServicelmpl implements ShiftsJobsService {
    @Autowired
    private ShiftsjobsDao shiftsJobsDao;

    @Override
    public ShiftsJobs saveShiftsJobs(ShiftsJobs shiftsJobs) {
        return shiftsJobsDao.save(shiftsJobs);
    }

    @Override
    public ShiftsJobs updateshiftsJobs(ShiftsJobs shiftsJobs) {
        return shiftsJobsDao.saveAndFlush(shiftsJobs);
    }

    @Override
    public List<ShiftsJobs> getAllShiftsJobsList() {
        return shiftsJobsDao.findAll();
    }

    @Override
    public Optional<ShiftsJobs> getshiftsJobs(ShiftsJobsCID shiftsJobsCID) {
        return shiftsJobsDao.findById(shiftsJobsCID);
    }

    @Override
    public void deleteshiftsJobs(ShiftsJobsCID shiftsJobsCID) {
        shiftsJobsDao.deleteById(shiftsJobsCID);
    }
}



