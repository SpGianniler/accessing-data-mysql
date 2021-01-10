package com.example.accessingdatamysql.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "holidays")
@Getter
@Setter
public class Holidays {
    @Id
    @Column(name = "hid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hid;

    @Column(name = "date")
    private String date;

    public Holidays() {
    }

    public Holidays(int hid, String date) {
        this.hid = hid;
        this.date = date;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
