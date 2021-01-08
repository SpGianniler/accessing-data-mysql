package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.repositories.CredentialsRepo;
import com.example.accessingdatamysql.model.Credentials;
import com.example.accessingdatamysql.model.compositeIDs.CredentialsCID;
import com.example.accessingdatamysql.services.CredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CredentialsServiceImpl implements CredentialsService {
    @Autowired
    private CredentialsRepo credentialsRepo;

    @Override
    public Credentials saveCredential(Credentials credential) {
        return credentialsRepo.save(credential);
    }

    @Override
    public Credentials updateCredential(Credentials credential) {
        return credentialsRepo.saveAndFlush(credential);
    }

    @Override
    public List<Credentials> getAllCredentialsList() {
        return credentialsRepo.findAll();
    }

    @Override
    public Optional<Credentials> getCredential(CredentialsCID credentialsCID) {
        return credentialsRepo.findById(credentialsCID);
    }

    @Override
    public void deleteCredential(CredentialsCID credentialsCID) {
        credentialsRepo.deleteById(credentialsCID);
    }
}
