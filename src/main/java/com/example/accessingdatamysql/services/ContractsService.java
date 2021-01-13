package com.example.accessingdatamysql.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.accessingdatamysql.model.Contracts;

public interface ContractsService {
    Contracts saveContract(Contracts contract);

    Contracts updateContract(Contracts contract);

    List<Contracts> getAllContractsList();

    Optional<Contracts> getContract(String start_date);

    void deleteContract(String start_date);
}
