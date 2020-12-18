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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")
    private Date leave_date;

    @Column(name = "eid")
    private int eid;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public Date getLeave_date() {
        return leave_date;
    }

    public void setLeave_date(Date leave_date) {
        this.leave_date = leave_date;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public boolean checkForTheRightDate() {
        return ChronoUnit.DAYS.between(LocalDate.now(), (java.time.temporal.Temporal) this.leave_date) > 0;
    }
}
