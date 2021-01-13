package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.repositories.ContractsRepo;
import com.example.accessingdatamysql.model.Contracts;
import com.example.accessingdatamysql.services.ContractsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractsServiceImpl implements ContractsService {
    @Autowired
    private ContractsRepo contractsRepo;

    @Override
    public Contracts saveContract(Contracts contract) {
        return contractsRepo.save(contract);
    }

    @Override
    public Contracts updateContract(Contracts contract) {
        return contractsRepo.saveAndFlush(contract);
    }

    @Override
    public List<Contracts> getAllContractsList() {
        return contractsRepo.findAll();
    }

    @Override
    public Optional<Contracts> getContract(String start_date) {
        return contractsRepo.findById(start_date);
    }

    @Override
    public void deleteContract(String start_date) {
        contractsRepo.deleteById(start_date);
    }
}
