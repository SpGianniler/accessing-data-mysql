package com.example.accessingdatamysql.services;



import com.example.accessingdatamysql.model.Shifts;

import java.util.List;
import java.util.Optional;

public interface ShiftsService {

    Shifts saveShift(Shifts shift);

    Shifts updateShift(Shifts shift);

    List<Shifts> getAllShiftsList();

    Optional<Shifts> getShift(int sid);

    void deleteShift(int sid);
}
