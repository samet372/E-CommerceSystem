package com.LoginSystem.entites.concretes;

import com.LoginSystem.entites.abstracts.Entity;

public class User implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String eMail;

    public User(int id, String firstName, String lastName, String password, String eMail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.eMail = eMail;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
