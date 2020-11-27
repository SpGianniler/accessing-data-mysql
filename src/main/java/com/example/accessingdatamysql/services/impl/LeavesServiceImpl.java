package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.daos.LeavesDao;
import com.example.accessingdatamysql.entities.Leaves;
import com.example.accessingdatamysql.services.LeavesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeavesServiceImpl implements LeavesService {

    @Autowired
    private LeavesDao leavesDao;

    @Override
    public Leaves saveLeave(Leaves leave) {
        return leavesDao.save(leave);
    }

    @Override
    public Leaves updateLeave(Leaves leave) {
        return leavesDao.saveAndFlush(leave);
    }

    @Override
    public List<Leaves> getAllLeavesList() {
        return leavesDao.findAll();
    }

    @Override
    public Optional<Leaves> getLeave(int lid) {
        return leavesDao.findById(lid);
    }

    @Override
    public void deleteLeave(int lid) {
        leavesDao.deleteById(lid);
    }
}
