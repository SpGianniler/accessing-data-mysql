package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.daos.CredentialsDao;
import com.example.accessingdatamysql.entities.Credentials;
import com.example.accessingdatamysql.services.CredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CredentialsServiceImpl implements CredentialsService {
    @Autowired
    private CredentialsDao credentialsDao;

    @Override
    public Credentials saveCredential(Credentials credential) {
        return credentialsDao.save(credential);
    }

    @Override
    public Credentials updateCredential(Credentials credential) {
        return credentialsDao.saveAndFlush(credential);
    }

    @Override
    public List<Credentials> getAllCredentialsList() {
        return credentialsDao.findAll();
    }

    @Override
    public Optional<Credentials> getCredential(String username) {
        return credentialsDao.findById(username);
    }

    @Override
    public void deleteCredential(String username) {
        credentialsDao.deleteById(username);
    }
}
