package com.example.accessingdatamysql.controllers;

import com.example.accessingdatamysql.model.Shifts;
import com.example.accessingdatamysql.services.ShiftsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("shifts")
@RestController
public class ShiftsController {
    @Autowired
    ShiftsService shiftsService;

    @PostMapping("/add")
    public Shifts save(@RequestBody Shifts shift){
        return shiftsService.saveShift(shift);
    }

    @PutMapping("/update")
    public Shifts update(@RequestBody Shifts shift){
        return shiftsService.updateShift(shift);
    }

    @GetMapping("/all")
    public List<Shifts> getAllShifts(){
        return shiftsService.getAllShiftsList();
    }

    @GetMapping("/shift/{sid}")
    public Optional<Shifts> getShift(@PathVariable(name = "sid")int sid){
        return shiftsService.getShift(sid);
    }

    @DeleteMapping("/delete/{sid}")
    public void deleteShift(@PathVariable(name = "sid")int sid){
        shiftsService.deleteShift(sid);
    }
}
