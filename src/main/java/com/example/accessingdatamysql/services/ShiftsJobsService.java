package com.example.accessingdatamysql.services;

import com.example.accessingdatamysql.model.ShiftsJobs;
import com.example.accessingdatamysql.model.compositeIDs.ShiftsJobsCID;

import java.util.List;
import java.util.Optional;

public interface ShiftsJobsService {

    ShiftsJobs  saveShiftsJobs(ShiftsJobs shiftsJobs) ;

    ShiftsJobs  updateshiftsJobs(ShiftsJobs shiftsJobs);

    Optional<ShiftsJobs> getshiftsJobs(ShiftsJobsCID shiftsJobsCID) ;

    void deleteshiftsJobs(ShiftsJobsCID shiftsJobsCID) ;

    List<ShiftsJobs> getAllShiftsJobsList();
}
