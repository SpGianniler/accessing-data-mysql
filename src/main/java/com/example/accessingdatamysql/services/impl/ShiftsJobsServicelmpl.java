package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.repositories.ShiftsjobsRepo;
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
    private ShiftsjobsRepo shiftsJobsRepo;

    @Override
    public ShiftsJobs saveShiftsJobs(ShiftsJobs shiftsJobs) {
        return shiftsJobsRepo.save(shiftsJobs);
    }

    @Override
    public ShiftsJobs updateshiftsJobs(ShiftsJobs shiftsJobs) {
        return shiftsJobsRepo.saveAndFlush(shiftsJobs);
    }

    @Override
    public List<ShiftsJobs> getAllShiftsJobsList() {
        return shiftsJobsRepo.findAll();
    }

    @Override
    public Optional<ShiftsJobs> getshiftsJobs(ShiftsJobsCID shiftsJobsCID) {
        return shiftsJobsRepo.findById(shiftsJobsCID);
    }

    @Override
    public void deleteshiftsJobs(ShiftsJobsCID shiftsJobsCID) {
        shiftsJobsRepo.deleteById(shiftsJobsCID);
    }
}



