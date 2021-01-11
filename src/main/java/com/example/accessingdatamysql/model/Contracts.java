package com.example.accessingdatamysql.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Entity
@Table(name = "contracts")
public class Contracts {
    @Id
    @Column(name = "start_date")
    private String start_date;

    @Column(name = "end_date")
    private String end_date;

    @Column(name = "type")
    private String type;

    @Column(name = "hours")
    private int hours;

    @Column(name = "eid")
    private int eid;

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int checkContractDetails()
    {
        try{
            if (this.type.equals("full")) {
                this.hours = 56;
            } else if (this.type.equals("part"))
                this.hours = 28;
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        return this.hours;
    }

//    public void endOfContract(){
//        //if(contractIsActive())
//        if(ChronoUnit.DAYS.between(LocalDate.now(), (java.time.temporal.Temporal) this.end_date)<=0){
//            // TODO: 07/12/2020 send notification to admin and corresponding employee
//        }
//    }
//
//    public boolean contractIsActive(){
//        // TODO: 08/12/2020 create a boolean field in the contracts table to check if the contract is active or not
//        return true;
//    }
//
//    public boolean compareStartToEndDate(){
//        return !this.start_date.after(end_date);
//    }
}
