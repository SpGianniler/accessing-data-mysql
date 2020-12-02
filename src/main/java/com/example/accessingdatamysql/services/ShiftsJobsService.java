package com.example.accessingdatamysql.services;

import com.example.accessingdatamysql.entities.ShiftsJobs;
import com.example.accessingdatamysql.entities.compositeIDs.ShiftsJobsCID;

import java.util.List;
import java.util.Optional;

public interface ShiftsJobsService {

    ShiftsJobs  saveShiftsJobs(ShiftsJobs shiftsJobs) ;

    ShiftsJobs  updateshiftsJobs(ShiftsJobs shiftsJobs);

    Optional<ShiftsJobs> getshiftsJobs(ShiftsJobsCID shiftsJobsCID) ;

    void deleteshiftsJobs(ShiftsJobsCID shiftsJobsCID) ;

    List<ShiftsJobs> getAllShiftsJobsList();
}
