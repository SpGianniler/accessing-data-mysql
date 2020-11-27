package com.example.accessingdatamysql.daos;

import com.example.accessingdatamysql.entities.Leaves;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeavesDao extends JpaRepository<Leaves,Integer> {
}
