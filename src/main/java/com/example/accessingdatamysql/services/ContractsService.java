package com.example.accessingdatamysql.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.accessingdatamysql.entities.Contracts;

public interface ContractsService {
    Contracts saveContract(Contracts contract);

    Contracts updateContract(Contracts contract);

    List<Contracts> getAllContractsList();

    Optional<Contracts> getContract(Date start_date);

    void deleteContract(Date jid);
}
