package com.example.accessingdatamysql.repositories;

import com.example.accessingdatamysql.model.Shifts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftsRepo extends JpaRepository<Shifts,Integer> {
}
