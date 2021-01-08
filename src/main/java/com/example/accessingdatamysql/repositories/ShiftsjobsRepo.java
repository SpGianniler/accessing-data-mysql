package com.example.accessingdatamysql.repositories;

import com.example.accessingdatamysql.model.ShiftsJobs;
import com.example.accessingdatamysql.model.compositeIDs.ShiftsJobsCID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftsjobsRepo extends JpaRepository<ShiftsJobs, ShiftsJobsCID>{
}
