package com.example.accessingdatamysql.daos;

import com.example.accessingdatamysql.entities.ShiftsJobs;
import com.example.accessingdatamysql.entities.compositeIDs.ShiftsJobsCID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftsjobsDao extends JpaRepository<ShiftsJobs, ShiftsJobsCID>{
}
