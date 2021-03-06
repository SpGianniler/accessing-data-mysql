package com.example.accessingdatamysql.controllers;

import com.example.accessingdatamysql.model.ShiftsJobs;
import com.example.accessingdatamysql.model.compositeIDs.ShiftsJobsCID;
import com.example.accessingdatamysql.services.ShiftsJobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("shifts-jobs")
@RestController
public class ShiftsJobsController {
    @Autowired
    private ShiftsJobsService shiftsJobsService;

    @PostMapping("/add")
    public ShiftsJobs save(@RequestBody ShiftsJobs shiftsJobs){
        return shiftsJobsService.saveShiftsJobs(shiftsJobs);
    }

    @PutMapping("/update")
    public ShiftsJobs update(@RequestBody ShiftsJobs shiftsJobs) {return shiftsJobsService.updateshiftsJobs(shiftsJobs);}

    @GetMapping("/all")
    public List<ShiftsJobs> getAllShiftsJobs(){
        return shiftsJobsService.getAllShiftsJobsList();
    }

    @GetMapping("/shifts-jobs/{key}")
    public Optional<ShiftsJobs> getShiftsJobs(@PathVariable(name = "key")ShiftsJobsCID shiftsJobsCID) {return shiftsJobsService.getshiftsJobs(shiftsJobsCID);}

    @DeleteMapping("/delete/{key}")
    public void deleteShifts(@PathVariable(name = "key") ShiftsJobsCID shiftsJobsCID) {shiftsJobsService.deleteshiftsJobs(shiftsJobsCID);}
}
