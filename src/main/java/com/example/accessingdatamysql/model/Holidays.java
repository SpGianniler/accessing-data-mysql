package com.example.accessingdatamysql.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")
    private Date date;

    public Holidays() {
    }

    public Holidays(int hid, Date date) {
        this.hid = hid;
        this.date = date;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
