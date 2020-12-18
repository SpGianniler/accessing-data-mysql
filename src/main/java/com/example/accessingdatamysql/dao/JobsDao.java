package com.example.accessingdatamysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.accessingdatamysql.model.Jobs;

@Repository
public interface JobsDao extends JpaRepository<Jobs, Integer> {

}
