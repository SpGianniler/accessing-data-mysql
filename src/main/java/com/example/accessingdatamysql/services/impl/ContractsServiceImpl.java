package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.dao.ContractsDao;
import com.example.accessingdatamysql.model.Contracts;
import com.example.accessingdatamysql.services.ContractsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ContractsServiceImpl implements ContractsService {
    @Autowired
    private ContractsDao contractsDao;

    @Override
    public Contracts saveContract(Contracts contract) {
        return contractsDao.save(contract);
    }

    @Override
    public Contracts updateContract(Contracts contract) {
        return contractsDao.saveAndFlush(contract);
    }

    @Override
    public List<Contracts> getAllContractsList() {
        return contractsDao.findAll();
    }

    @Override
    public Optional<Contracts> getContract(Date start_date) {
        return contractsDao.findById(start_date);
    }

    @Override
    public void deleteContract(Date start_date) {
        contractsDao.deleteById(start_date);
    }
}
