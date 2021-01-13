package com.example.accessingdatamysql.model.compositeIDs;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class EmployeesHoursCID implements Serializable {
    private int eid;

    private int sid;

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

    public EmployeesHoursCID() {
    }

    public EmployeesHoursCID(int eid, int sid) {
        this.eid = eid;
        this.sid = sid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeesHoursCID that = (EmployeesHoursCID) o;
        return eid == that.eid &&
                sid == that.sid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, sid);
    }
}

