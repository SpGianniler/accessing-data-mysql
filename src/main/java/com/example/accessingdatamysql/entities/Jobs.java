package com.example.accessingdatamysql.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "jobs")
@Getter
@Setter
public class Jobs {
    @Id
    @Column(name = "jid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int jid;

    @Column(name = "job_name")
    private String name;

    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
    }

    public String getName() {
        return name;
    }

    public void setName(String jobName) {
        this.name = jobName;
    }

}
