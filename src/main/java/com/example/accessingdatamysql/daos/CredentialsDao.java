package com.example.accessingdatamysql.daos;

import com.example.accessingdatamysql.entities.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialsDao extends JpaRepository<Credentials,String> {
}
