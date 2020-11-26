package com.example.accessingdatamysql.services;

import java.util.List;
import java.util.Optional;

import com.example.accessingdatamysql.entities.Jobs;

public interface JobsService {

    Jobs saveJob(Jobs job);

    Jobs updateJob(Jobs job);

    List<Jobs> getAllJobsList();

    Optional<Jobs> getJob(int jid);

    void deleteJob(int jid);

}
