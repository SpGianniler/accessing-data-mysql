package com.example.accessingdatamysql.dao;

import com.example.accessingdatamysql.model.Contracts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;

@Repository
public interface ContractsDao extends JpaRepository<Contracts, Date> {

}
