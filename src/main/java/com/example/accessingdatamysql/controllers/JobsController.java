package com.example.accessingdatamysql.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.accessingdatamysql.model.Jobs;
import com.example.accessingdatamysql.services.JobsService;

@RequestMapping("jobs")
@RestController
public class JobsController {

    @Autowired
    private JobsService jobsService;

    @PostMapping("/add")
    public Jobs save(@RequestBody Jobs job){
        return jobsService.saveJob(job);
    }

    @PutMapping("/update")
    public Jobs update(@RequestBody Jobs job) {
        return jobsService.updateJob(job);
    }

    @GetMapping("/all")
    public List<Jobs> getAllJobs(){
        return jobsService.getAllJobsList();
    }

    @GetMapping("/job/{jid}")
    public Optional<Jobs> getJob(@PathVariable(name = "jid") int jid) {
        return jobsService.getJob(jid);
    }

    @DeleteMapping("/delete/{jid}")
    public void deleteJob(@PathVariable(name = "jid") int jid) {
        jobsService.deleteJob(jid);
    }
}
