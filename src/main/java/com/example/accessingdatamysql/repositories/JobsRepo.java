package com.example.accessingdatamysql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.accessingdatamysql.model.Jobs;

@Repository
public interface JobsRepo extends JpaRepository<Jobs, Integer> {

}
