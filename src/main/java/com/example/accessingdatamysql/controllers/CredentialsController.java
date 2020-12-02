package com.example.accessingdatamysql.controllers;

import com.example.accessingdatamysql.entities.Credentials;
import com.example.accessingdatamysql.entities.compositeIDs.CredentialsCID;
import com.example.accessingdatamysql.services.CredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("credentials")
@RestController
public class CredentialsController {
    @Autowired
    private CredentialsService credentialsService;

    @PostMapping("/add")
    public Credentials save(@RequestBody Credentials credential){return credentialsService.saveCredential(credential);}

    @PutMapping("/update")
    public Credentials update(@RequestBody Credentials credential){return credentialsService.updateCredential(credential);}

    @GetMapping("/all-credentials")
    public List<Credentials> getAllCredentials(){return credentialsService.getAllCredentialsList();}

    @GetMapping("/credential/{key}")
    public Optional<Credentials> getCredential(@PathVariable(name = "key")CredentialsCID credentialsCID){return credentialsService.getCredential(credentialsCID);}

    @DeleteMapping("/delete/{key}")
    public void deleteCredential(@PathVariable(name = "key")CredentialsCID credentialsCID){credentialsService.deleteCredential(credentialsCID);}
}
