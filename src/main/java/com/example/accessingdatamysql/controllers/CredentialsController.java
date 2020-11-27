package com.example.accessingdatamysql.controllers;

import com.example.accessingdatamysql.entities.Credentials;
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

    @GetMapping("/credential/{username}")
    public Optional<Credentials> getCredential(@PathVariable(name = "username")String username){return credentialsService.getCredential(username);}

    @DeleteMapping("/delete/{username}")
    public void deleteCredential(@PathVariable(name = "username")String username){credentialsService.deleteCredential(username);}
}
