package com.example.herud.lab2;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by Herud on 2018-03-15.
 */

public class Person{
    private String name;
    private String lastName;
    private Date bDate;
    private Integer picture;

    public Person(String n, String ln, Date d)
    {
        name=n;
        lastName=ln;
        bDate=d;
    }
    public Person(String n, String ln,Integer picture)
    {
        name=n;
        lastName=ln;
        this.picture=picture;
    }

    public Integer getPicture() {
        return picture;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getbDate() {
        return bDate;
    }
}
