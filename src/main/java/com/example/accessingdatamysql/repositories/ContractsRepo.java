package com.example.accessingdatamysql.repositories;

import com.example.accessingdatamysql.model.Contracts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractsRepo extends JpaRepository<Contracts, String> {

}
