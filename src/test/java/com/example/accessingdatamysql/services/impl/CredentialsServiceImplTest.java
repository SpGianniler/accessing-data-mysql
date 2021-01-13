package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.model.Credentials;
import com.example.accessingdatamysql.model.compositeIDs.CredentialsCID;
import com.example.accessingdatamysql.repositories.CredentialsRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CredentialsServiceImplTest {
    @InjectMocks
    private CredentialsServiceImpl credentialsService;

    @Mock
    private CredentialsRepo credentialsRepo;

    private Credentials credentials;
    private Credentials credentials1;
    private CredentialsCID credentialsCID;
    private List<Credentials> credentialsList = new ArrayList<>();

    @Before
    public void setup(){
        credentials = new Credentials("ddd", (byte) 1,"sss",1);
        credentials1 = new Credentials("ddd", (byte) 1,"fff",1);
        credentialsCID = new CredentialsCID("ddd",(byte)1);
        credentialsList = Arrays.asList(credentials,credentials);
    }

    @Test
    public void saveCredential() {
        when(credentialsRepo.save(credentials)).thenReturn(credentials);
        assertEquals(credentials,credentialsService.saveCredential(credentials));
    }

    @Test
    public void updateCredential() {
        when(credentialsRepo.saveAndFlush(credentials1)).thenReturn(credentials1);
        assertEquals(credentials1,credentialsService.updateCredential(credentials1));
    }

    @Test
    public void getAllCredentialsList() {
        when(credentialsRepo.findAll()).thenReturn(credentialsList);
        assertEquals(credentialsList,credentialsService.getAllCredentialsList());
    }

    @Test
    public void getCredential() {
        when(credentialsRepo.findById(credentialsCID)).thenReturn(java.util.Optional.ofNullable(credentials));
        assertEquals(java.util.Optional.ofNullable(credentials),credentialsService.getCredential(credentialsCID));
    }

    @Test
    public void deleteCredential() {
    }
}