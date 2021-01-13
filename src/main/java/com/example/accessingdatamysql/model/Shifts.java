package com.example.accessingdatamysql.model;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Shifts() {
    }

    public Shifts(int sid, String shift_name) {
        this.sid = sid;
        this.shift_name = shift_name;
    }

    public String checkShiftsDetails()
    {
        try{
            if (this.sid == 1) {
                this.shift_name = shift_name;
            } else if (this.sid == 2){
                this.shift_name = shift_name;
            }else {
                this.shift_name = shift_name;
            }
        }
        catch (NullPointerException s){
            s.printStackTrace();
        }
        return this.shift_name;
    }
}
