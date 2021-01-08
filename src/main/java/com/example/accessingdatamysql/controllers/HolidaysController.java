package com.example.accessingdatamysql.controllers;

import com.example.accessingdatamysql.model.Holidays;
import com.example.accessingdatamysql.services.HolidaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("holidays")
@RestController
public class HolidaysController {

    @Autowired
    private HolidaysService holidaysService;

    @PostMapping("/add")
    public Holidays save(@RequestBody Holidays holiday){
        return holidaysService.saveHoliday(holiday);
    }

    @PutMapping("/update")
    public Holidays update(@RequestBody Holidays holiday) {
        return holidaysService.updateHoliday(holiday);
    }

    @GetMapping("/all")
    public List<Holidays> getAllHolidays(){
        return holidaysService.getAllHolidaysList();
    }

    @GetMapping("/job/{hid}")
    public Optional<Holidays> getHoliday(@PathVariable(name = "hid") int hid) {
        return holidaysService.getHoliday(hid);
    }

    @DeleteMapping("/delete/{hid}")
    public void deleteHoliday(@PathVariable(name = "hid") int hid) {
        holidaysService.deleteHoliday(hid);
    }
}
