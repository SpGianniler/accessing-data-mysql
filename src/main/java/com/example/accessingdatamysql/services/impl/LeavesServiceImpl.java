package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.repositories.LeavesRepo;
import com.example.accessingdatamysql.model.Leaves;
import com.example.accessingdatamysql.services.LeavesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeavesServiceImpl implements LeavesService {

    @Autowired
    private LeavesRepo leavesRepo;

    @Override
    public Leaves saveLeave(Leaves leave) {
        return leavesRepo.save(leave);
    }

    @Override
    public Leaves updateLeave(Leaves leave) {
        return leavesRepo.saveAndFlush(leave);
    }

    @Override
    public List<Leaves> getAllLeavesList() {
        return leavesRepo.findAll();
    }

    @Override
    public Optional<Leaves> getLeave(int lid) {
        return leavesRepo.findById(lid);
    }

    @Override
    public void deleteLeave(int lid) {
        leavesRepo.deleteById(lid);
    }
}
