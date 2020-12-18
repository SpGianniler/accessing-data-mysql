package com.example.accessingdatamysql.dao;

import com.example.accessingdatamysql.model.Credentials;
import com.example.accessingdatamysql.model.compositeIDs.CredentialsCID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialsDao extends JpaRepository<Credentials, CredentialsCID> {
}
