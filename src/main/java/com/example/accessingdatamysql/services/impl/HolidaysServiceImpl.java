package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.model.Holidays;
import com.example.accessingdatamysql.model.Jobs;
import com.example.accessingdatamysql.repositories.HolidaysRepo;
import com.example.accessingdatamysql.services.HolidaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HolidaysServiceImpl implements HolidaysService {
    @Autowired
    private HolidaysRepo holidaysRepo;


    @Override
    public Holidays saveHoliday(Holidays holiday) {
        return holidaysRepo.save(holiday);
    }

    @Override
    public Holidays updateHoliday(Holidays holiday) {
        return holidaysRepo.saveAndFlush(holiday);
    }

    @Override
    public List<Holidays> getAllHolidaysList() {
        return holidaysRepo.findAll();
    }

    @Override
    public Optional<Holidays> getHoliday(int hid) {
        return holidaysRepo.findById(hid);
    }

    @Override
    public void deleteHoliday(int hid) {
        holidaysRepo.deleteById(hid);
    }
}
