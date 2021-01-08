package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.repositories.ShiftsRepo;
import com.example.accessingdatamysql.model.Shifts;
import com.example.accessingdatamysql.services.ShiftsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShiftsServiceImpl implements ShiftsService {
    @Autowired
    ShiftsRepo shiftsRepo;

    @Override
    public Shifts saveShift(Shifts shift) {
        return shiftsRepo.save(shift);
    }

    @Override
    public Shifts updateShift(Shifts shift) {
        return shiftsRepo.saveAndFlush(shift);
    }

    @Override
    public List<Shifts> getAllShiftsList() {
        return shiftsRepo.findAll();
    }

    @Override
    public Optional<Shifts> getShift(int sid) {
        return shiftsRepo.findById(sid);
    }

    @Override
    public void deleteShift(int sid) {
        shiftsRepo.deleteById(sid);
    }
}
