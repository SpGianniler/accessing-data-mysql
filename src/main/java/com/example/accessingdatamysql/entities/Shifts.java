package com.example.accessingdatamysql.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "shifts")
@Getter
@Setter
public class Shifts {
    @Id
    @Column(name = "sid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;

    @Column(name = "shift_name")
    private String shift_name;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getShift_name() {
        return shift_name;
    }

    public void setShift_name(String shift_name) {
        this.shift_name = shift_name;
    }
}
