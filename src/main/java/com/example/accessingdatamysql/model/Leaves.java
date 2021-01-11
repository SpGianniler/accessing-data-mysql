package com.example.accessingdatamysql.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Entity
@Table(name = "leaves")
@Getter
@Setter
public class Leaves {
    @Id
    @Column(name = "lid")
    private int lid;

    @Column(name = "leave_date")
    private String leave_date;

    @Column(name = "duration")
    private int duration;

    @Column(name = "reason")
    private String reason;

    @Column(name = "eid")
    private int eid;

    public Leaves() {
    }

    public Leaves(int lid, String leave_date, int duration, String reason, int eid) {
        this.lid = lid;
        this.leave_date = leave_date;
        this.duration = duration;
        this.reason = reason;
        this.eid = eid;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLeave_date() {
        return leave_date;
    }

    public void setLeave_date(String leave_date) {
        this.leave_date = leave_date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

//    public boolean checkForTheRightDate() {
//        return ChronoUnit.DAYS.between(LocalDate.now(), (java.time.temporal.Temporal) this.leave_date) > 0;
//    }
}
