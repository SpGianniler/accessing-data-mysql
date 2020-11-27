package com.example.accessingdatamysql.entities;

import com.example.accessingdatamysql.entities.compositeIDs.CredentialsCID;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "credentials")
@IdClass(CredentialsCID.class)
@Getter
@Setter
public class Credentials {
    @Id
    @Column(name = "username")
    private String username;

    @Id
    @Column(name = "is_admin")
    private byte is_admin;

    @Column(name = "password")
    private String password;

    @Column(name = "eid")
    private int eid;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public byte getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(byte is_admin) {
        this.is_admin = is_admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public Credentials(String username, byte is_admin, String password, int eid){
        this.username = username;
        this.is_admin = is_admin;
        this.password = password;
        this.eid = eid;
    }

    public Credentials() {

    }
}
