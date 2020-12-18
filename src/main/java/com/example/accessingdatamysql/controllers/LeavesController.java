package com.example.accessingdatamysql.controllers;

import com.example.accessingdatamysql.model.Leaves;
import com.example.accessingdatamysql.services.LeavesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("leaves")
@RestController
public class LeavesController {
    @Autowired
    private LeavesService leavesService;

    @PostMapping("/add")
    public Leaves save(@RequestBody Leaves leave){
        return leavesService.saveLeave(leave);
    }

    @PutMapping("/update")
    public Leaves update(@RequestBody Leaves leave){
        return leavesService.updateLeave(leave);
    }

    @GetMapping("/all-leaves")
    public List<Leaves>getAllLeaves(){
        return leavesService.getAllLeavesList();
    }

    @GetMapping("/leave/{lid}")
    public Optional<Leaves> getJob(@PathVariable(name = "lid")int lid){
        return leavesService.getLeave(lid);
    }

    @DeleteMapping("/delete/{lid}")
    public void deleteLeave(@PathVariable(name = "lid")int lid){
        leavesService.deleteLeave(lid);
    }
}
