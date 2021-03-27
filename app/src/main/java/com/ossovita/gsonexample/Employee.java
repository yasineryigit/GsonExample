package com.ossovita.gsonexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {
    @Expose
    private String mFirstName;
    @Expose
    private int mAge;
    @Expose
    private String mMail;
    @Expose
    private transient String password;


    public Employee(String firstName, int age, String mail,String password) {
        this.mFirstName = firstName;
        this.mAge = age;
        this.mMail = mail;
        this.password=password;
    }
}
