package com.example.accessingdatamysql.entities;

import com.example.accessingdatamysql.entities.compositeIDs.EmployeesHoursCID;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "employees_needed")
@IdClass(EmployeesHoursCID.class)
@Setter
@Getter
public class EmployeesHours {
    @Id
    @Column(name = "Employeeseid")
    private int EmployeesEid;

    @Id
    @Column(name = "Shifthssid")
    private int ShiftsSid;

    public int getEmployeesEid() {
        return EmployeesEid;
    }

    public void setEmployeesEid(int employeesEid) {
        EmployeesEid = employeesEid;
    }

    public int getShiftsSid() {
        return ShiftsSid;
    }

    public void setShiftsSid(int shiftsSid) {
        ShiftsSid = shiftsSid;
    }

//    public int saveEmployeesHoursDao(EmployeesHours employeesHours){
//        return 0;
//    }
//
//
//    public int  updateEmployeesHours(EmployeesHours employeesHours){
//        return 0;
//    }
//
//    public int List<EmployeesHours> getAllEmployeesHoursList(){
//
//    }
//
//    public int Optional<EmployeesHours> getEmployeesHours(){
//
//    }
//
//    public  void deleteEmployeesHours(int EmployeesEid){}
}
