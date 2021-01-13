package com.example.accessingdatamysql.model.compositeIDs;

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

    public ShiftsJobsCID() {
    }

    public ShiftsJobsCID(int sid, int jid) {
        this.sid = sid;
        this.jid = jid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        ShiftsJobsCID that = (ShiftsJobsCID) o;
        return sid == that.sid &&
                jid == that.jid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, jid);
    }
}
