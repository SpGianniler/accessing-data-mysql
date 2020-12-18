package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.dao.ShiftsDao;
import com.example.accessingdatamysql.model.Shifts;
import com.example.accessingdatamysql.services.ShiftsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShiftsServiceImpl implements ShiftsService {
    @Autowired
    ShiftsDao shiftsDao;

    @Override
    public Shifts saveShift(Shifts shift) {
        return shiftsDao.save(shift);
    }

    @Override
    public Shifts updateShift(Shifts shift) {
        return shiftsDao.saveAndFlush(shift);
    }

    @Override
    public List<Shifts> getAllShiftsList() {
        return shiftsDao.findAll();
    }

    @Override
    public Optional<Shifts> getShift(int sid) {
        return shiftsDao.findById(sid);
    }

    @Override
    public void deleteShift(int sid) {
        shiftsDao.deleteById(sid);
    }
}
