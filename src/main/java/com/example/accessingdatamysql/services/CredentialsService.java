package com.example.accessingdatamysql.services;

import com.example.accessingdatamysql.model.Credentials;
import com.example.accessingdatamysql.model.compositeIDs.CredentialsCID;

import java.util.List;
import java.util.Optional;

public interface CredentialsService {

    Credentials saveCredential(Credentials credential);

    Credentials updateCredential(Credentials credential);

    Optional<Credentials> getCredential(CredentialsCID credentialsCID);

    void deleteCredential(CredentialsCID credentialsCID);

    List<Credentials> getAllCredentialsList();
}
