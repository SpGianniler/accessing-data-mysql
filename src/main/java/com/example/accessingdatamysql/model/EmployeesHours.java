package com.example.accessingdatamysql.model;

import com.example.accessingdatamysql.model.compositeIDs.EmployeesHoursCID;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "employees_hours")
@IdClass(EmployeesHoursCID.class)
@Getter
@Setter
public class EmployeesHours {
    @Id
    @Column(name = "eid")
    private int eid;

    @Id
    @Column(name = "sid")
    private int sid;

    @Column(name = "hours_worked")
    private int hours_worked;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getHours_worked() {
        return hours_worked;
    }

    public void setHours_worked(int hours_worked) {
        this.hours_worked = hours_worked;
    }

    public EmployeesHours(int eid, int sid, int hours_worked) {
        this.eid = eid;
        this.sid = sid;
        this.hours_worked = hours_worked;
    }

    public EmployeesHours() {

    }
}
