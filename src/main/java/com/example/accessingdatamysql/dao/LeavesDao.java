package com.example.accessingdatamysql.dao;

import com.example.accessingdatamysql.model.Leaves;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeavesDao extends JpaRepository<Leaves,Integer> {
}
