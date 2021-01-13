package com.example.accessingdatamysql.services.impl;

import com.example.accessingdatamysql.model.Leaves;
import com.example.accessingdatamysql.repositories.LeavesRepo;
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
public class LeavesServiceImplTest {
    @InjectMocks
    private LeavesServiceImpl leavesService;

    @Mock
    private LeavesRepo leavesRepo;

    private Leaves leaves;
    private Leaves leaves1;
    private List<Leaves> leavesList = new ArrayList<>();

    @Before
    public void setup(){
        leaves = new Leaves(1,"10/10/10",2,"aaa",1);
        leaves1 = new Leaves(1,"10/10/10",2,"ddd",1);
        leavesList = Arrays.asList(leaves,leaves);
    }

    @Test
    public void saveLeave() {
        when(leavesRepo.save(leaves)).thenReturn(leaves);
        assertEquals(leaves,leavesService.saveLeave(leaves));
    }

    @Test
    public void updateLeave() {
        when(leavesRepo.saveAndFlush(leaves1)).thenReturn(leaves1);
        assertEquals(leaves1,leavesService.updateLeave(leaves1));
    }

    @Test
    public void getAllLeavesList() {
        when(leavesRepo.findAll()).thenReturn(leavesList);
        assertEquals(leavesList,leavesService.getAllLeavesList());
    }

    @Test
    public void getLeave() {
        when(leavesRepo.findById(1)).thenReturn(java.util.Optional.ofNullable(leaves));
        assertEquals(java.util.Optional.ofNullable(leaves),leavesService.getLeave(1));
    }

    @Test
    public void deleteLeave() {
    }
}