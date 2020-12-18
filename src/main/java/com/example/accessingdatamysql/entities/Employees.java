package com.example.accessingdatamysql.entities;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employees {
    @Id
    @Column(name = "eid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "birth_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date birth_date;

    @Column(name = "jid")
    private int jid;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getBirth_date() {
        return birth_date;
    }
    
//    public String getBirth_date() {
//        Date date = birth_date;
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        return dateFormat.format(date);
//    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
    }

    // do not allow employees of age 16 or lower
    public boolean checkBirthDateValidity(){
        return ChronoUnit.YEARS.between(LocalDate.now(), (java.time.temporal.Temporal) this.birth_date) >= 16;
    }
}
