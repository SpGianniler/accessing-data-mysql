package com.example.accessingdatamysql.model;

import com.example.accessingdatamysql.model.compositeIDs.ShiftsJobsCID;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="shifts_jobs")
@IdClass(ShiftsJobsCID.class)
@Getter
@Setter
public class ShiftsJobs {
    @Id
    @Column(name = "sid")
    private int sid;
    @Id
    @Column(name = "jid")
    private int jid;
    @Column(name = "employees_needed")
    private int employeesneed;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
    }

    public int getEmployeesneed() {
        return employeesneed;
    }

    public void setEmployeesneed(int employeesneed) {
        this.employeesneed = employeesneed;
    }

    public ShiftsJobs(int sid, int jid, int employeesneed) {
        this.sid = sid;
        this.jid = jid;
        this.employeesneed = employeesneed;
    }

    public ShiftsJobs() {

    }
}
