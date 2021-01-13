package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.model.Holidays;
import com.example.accessingdatamysql.repositories.HolidaysRepo;
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
public class HolidaysServiceImplTest {
    @InjectMocks
    private HolidaysServiceImpl holidaysService;

    @Mock
    private HolidaysRepo holidaysRepo;

    private Holidays holidays;
    private Holidays holidays1;
    private List<Holidays> holidaysList = new ArrayList<>();

    @Before
    public void setup(){
        holidays = new Holidays(1,"10/10/10");
        holidays1 = new Holidays(1,"09/10/10");
        holidaysList = Arrays.asList(holidays,holidays);
    }

    @Test
    public void saveHoliday() {
        when(holidaysRepo.save(holidays)).thenReturn(holidays);
        assertEquals(holidays,holidaysService.saveHoliday(holidays));
    }

    @Test
    public void updateHoliday() {
        when(holidaysRepo.saveAndFlush(holidays1)).thenReturn(holidays1);
        assertEquals(holidays1,holidaysService.updateHoliday(holidays1));
    }

    @Test
    public void getAllHolidaysList() {
        when(holidaysRepo.findAll()).thenReturn(holidaysList);
        assertEquals(holidaysList,holidaysService.getAllHolidaysList());
    }

    @Test
    public void getHoliday() {
        when(holidaysRepo.findById(1)).thenReturn(java.util.Optional.ofNullable(holidays));
        assertEquals(java.util.Optional.ofNullable(holidays),holidaysService.getHoliday(1));
    }

    @Test
    public void deleteHoliday() {
    }
}