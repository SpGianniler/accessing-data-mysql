package com.example.accessingdatamysql.controllers;

import com.example.accessingdatamysql.model.Contracts;
import com.example.accessingdatamysql.services.ContractsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RequestMapping(path="/contracts")
@RestController
public class ContractsController {

    @Autowired
    private ContractsService contractsService;

    @PostMapping("/add")
    public Contracts save(@RequestBody Contracts contract){
        return contractsService.saveContract(contract);
    }

    @PutMapping("/update")
    public Contracts update(@RequestBody Contracts contract) {
        return contractsService.updateContract(contract);
    }

    @GetMapping("/all-contracts")
    public List<Contracts> getAllContracts(){
        return contractsService.getAllContractsList();
    }

    @GetMapping("/job/{start_date}")
    public Optional<Contracts> getContract(@PathVariable(name = "start_date") Date start_date) {
        return contractsService.getContract(start_date);
    }

    @DeleteMapping("/delete/{start_date}")
    public void deleteContract(@PathVariable(name = "start_date") Date start_date) {
        contractsService.deleteContract(start_date);
    }

//    @PostMapping(path="/add")
//    public String addNewContract(@RequestParam Date start_date, @RequestParam Date end_date, @RequestParam String type, @RequestParam int eid){
//        Contracts c= new Contracts();
//        c.setStart_date(start_date);
//        c.setEnd_date(end_date);
//        c.setType(type);
//        c.setEid(eid);
//        contractsDao.save(c);
//        return "Contract Saved";
//    }
//
//    @GetMapping(path = "all-contracts")
//    public Iterable<Contracts> getAllContracts(){
//        return contractsDao.findAll();
//    }
}
