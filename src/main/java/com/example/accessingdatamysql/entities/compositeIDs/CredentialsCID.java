package com.example.accessingdatamysql.entities.compositeIDs;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class CredentialsCID implements Serializable {
    private String username;

    private byte is_admin;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        CredentialsCID that = (CredentialsCID) o;
        return is_admin == that.is_admin &&
                username.equals(that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, is_admin);
    }
}
