package com.example.accessingdatamysql.repositories;

import com.example.accessingdatamysql.model.Leaves;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeavesRepo extends JpaRepository<Leaves,Integer> {
}
