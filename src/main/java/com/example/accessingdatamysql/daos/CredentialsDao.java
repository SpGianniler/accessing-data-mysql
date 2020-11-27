package com.example.accessingdatamysql.daos;

import com.example.accessingdatamysql.entities.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialsDao extends JpaRepository<Credentials,String> {
}