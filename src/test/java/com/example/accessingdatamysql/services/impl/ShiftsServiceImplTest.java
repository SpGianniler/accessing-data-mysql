package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.model.Shifts;
import com.example.accessingdatamysql.repositories.ShiftsRepo;
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
public class ShiftsServiceImplTest {
    @InjectMocks
    private ShiftsServiceImpl shiftsService;

    @Mock
    private ShiftsRepo shiftsRepo;

    private Shifts shifts;
    private Shifts shifts1;
    private List<Shifts> shiftsList = new ArrayList<>();

    @Before
    public void setup(){
        shifts = new Shifts(1,"fff");
        shifts1 = new Shifts(1,"aaa");
        shiftsList = Arrays.asList(shifts,shifts);
    }

    @Test
    public void saveShift() {
        when(shiftsRepo.save(shifts)).thenReturn(shifts);
        assertEquals(shifts,shiftsService.saveShift(shifts));
    }

    @Test
    public void updateShift() {
        when(shiftsRepo.saveAndFlush(shifts1)).thenReturn(shifts1);
        assertEquals(shifts1,shiftsService.updateShift(shifts1));
    }

    @Test
    public void getAllShiftsList() {
        when(shiftsRepo.findAll()).thenReturn(shiftsList);
        assertEquals(shiftsList,shiftsService.getAllShiftsList());
    }

    @Test
    public void getShift() {
        when(shiftsRepo.findById(1)).thenReturn(java.util.Optional.ofNullable(shifts));
        assertEquals(java.util.Optional.ofNullable(shifts),shiftsService.getShift(1));
    }

    @Test
    public void deleteShift() {
    }
}