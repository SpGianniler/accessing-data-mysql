package com.example.accessingdatamysql.services;

import com.example.accessingdatamysql.entities.Leaves;

import java.util.List;
import java.util.Optional;

public interface LeavesService {
    Leaves saveLeave(Leaves leave);

    Leaves updateLeave(Leaves leave);

    List<Leaves> getAllLeavesList();

    Optional<Leaves> getLeave(int lid);

    void deleteLeave(int lid);
}
