package com.example.accessingdatamysql.services;

import com.example.accessingdatamysql.entities.Credentials;

import java.util.List;
import java.util.Optional;

public interface CredentialsService {

    Credentials saveCredential(Credentials credential);

    Credentials updateCredential(Credentials credential);

    List<Credentials> getAllCredentialsList();

    Optional<Credentials> getCredential(String username);

    void  deleteCredential(String username);
}
