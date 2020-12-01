package com.example.accessingdatamysql.entities.compositeIDs;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class ShiftsJobsCID implements Serializable {
    private int sid;
    private int jid;
    private  int employees_need;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
    }

    public int getEmployees_need() {
        return employees_need;
    }

    public void setEmployees_need(int employees_need) {
        this.employees_need = employees_need;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShiftsJobsCID that = (ShiftsJobsCID) o;
        return sid == that.sid &&
                jid == that.jid &&
                employees_need == that.employees_need;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, jid, employees_need);
    }
}
