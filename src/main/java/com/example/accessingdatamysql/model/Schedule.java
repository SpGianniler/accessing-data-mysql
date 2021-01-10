package com.example.accessingdatamysql.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "schedule")
@Getter
@Setter
public class Schedule {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date")
    private String date;

    @Column(name = "shift_name")
    private String shift_name;

    @Column(name = "eid")
    private int eid;

    @Column(name = "schedule_name")
    private String schedule_name;

    public Schedule() {
    }

    public Schedule(int id, String date, String shift_name, int eid, String schedule_name) {
        this.id = id;
        this.date = date;
        this.shift_name = shift_name;
        this.eid = eid;
        this.schedule_name = schedule_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getShift_name() {
        return shift_name;
    }

    public void setShift_name(String shift_name) {
        this.shift_name = shift_name;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getSchedule_name() {
        return schedule_name;
    }

    public void setSchedule_name(String schedule_name) {
        this.schedule_name = schedule_name;
    }
}
