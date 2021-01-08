package com.example.accessingdatamysql.services;

import com.example.accessingdatamysql.model.Holidays;
import com.example.accessingdatamysql.model.Jobs;

import java.util.List;
import java.util.Optional;

public interface HolidaysService {

    Holidays saveHoliday(Holidays holiday);

    Holidays updateHoliday(Holidays holiday);

    List<Holidays> getAllHolidaysList();

    Optional<Holidays> getHoliday(int hid);

    void deleteHoliday(int hid);
}
