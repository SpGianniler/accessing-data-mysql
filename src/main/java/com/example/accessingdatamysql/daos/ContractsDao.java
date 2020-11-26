package com.example.accessingdatamysql.daos;

import com.example.accessingdatamysql.entities.Contracts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;

@Repository
public interface ContractsDao extends JpaRepository<Contracts, Date> {

}
