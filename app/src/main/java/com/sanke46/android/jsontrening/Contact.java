package com.sanke46.android.jsontrening;

/**
 * Created by ilafedoseev on 14.03.17.
 */

public class Contact {
    int id;
    String name;
    String phoneNumber;

    public Contact(){

    }

    public Contact(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(int id, String name,String phoneNumber){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // ***********
    // GET methods
    // ***********

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // ***********
    // SET methods
    // ***********


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
