package com.example.accessingdatamysql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.accessingdatamysql.model.Holidays;

@Repository
public interface HolidaysRepo extends JpaRepository<Holidays, Integer> {
}
