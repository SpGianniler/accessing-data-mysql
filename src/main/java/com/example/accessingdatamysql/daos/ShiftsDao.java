package com.example.accessingdatamysql.daos;

import com.example.accessingdatamysql.entities.Shifts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftsDao extends JpaRepository<Shifts,Integer> {
}
