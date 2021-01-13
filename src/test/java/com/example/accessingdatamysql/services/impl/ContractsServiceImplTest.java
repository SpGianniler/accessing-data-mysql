package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.model.Contracts;
import com.example.accessingdatamysql.repositories.ContractsRepo;
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
public class ContractsServiceImplTest {
    @InjectMocks
    private ContractsServiceImpl contractsService;

    @Mock
    private ContractsRepo contractsRepo;

    private Contracts contracts;
    private Contracts contracts1;
    private List<Contracts> contractsList = new ArrayList<>();

    @Before
    public void setup(){
        contracts = new Contracts("10/10/10","11/12/12","full",56,1);
        contracts1 = new Contracts("09/10/10","11/12/12","full",56,2);
        contractsList = Arrays.asList(contracts,contracts);
    }

    @Test
    public void saveContract() {
        when(contractsRepo.save(contracts)).thenReturn(contracts);
        assertEquals(contracts,contractsService.saveContract(contracts));
    }

    @Test
    public void updateContract() {
        when(contractsRepo.saveAndFlush(contracts1)).thenReturn(contracts1);
        assertEquals(contracts1,contractsService.updateContract(contracts1));
    }

    @Test
    public void getAllContractsList() {
        when(contractsRepo.findAll()).thenReturn(contractsList);
        assertEquals(contractsList,contractsService.getAllContractsList());
    }

    @Test
    public void getContract() {
        when(contractsRepo.findById("10/10/10")).thenReturn(java.util.Optional.ofNullable(contracts));
        assertEquals(java.util.Optional.ofNullable(contracts),contractsService.getContract("10/10/10"));
    }

    @Test
    public void deleteContract() {
    }
}