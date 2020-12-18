package com.example.accessingdatamysql.dao;

import com.example.accessingdatamysql.model.ShiftsJobs;
import com.example.accessingdatamysql.model.compositeIDs.ShiftsJobsCID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftsjobsDao extends JpaRepository<ShiftsJobs, ShiftsJobsCID>{
}
