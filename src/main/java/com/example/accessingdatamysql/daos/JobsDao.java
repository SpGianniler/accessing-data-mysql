package com.example.accessingdatamysql.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.accessingdatamysql.entities.Jobs;

@Repository
public interface JobsDao extends JpaRepository<Jobs, Integer> {

}
