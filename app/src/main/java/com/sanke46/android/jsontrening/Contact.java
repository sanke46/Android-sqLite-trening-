package com.sanke46.android.jsontrening;

/**
 * Created by ilafedoseev on 14.03.17.
 */

public class Contact {
    int id;
    String name;
    String phoneNumber;
    int price;
    int imgId;
    String commentsAbout;

    public Contact(){

    }

    public Contact(String name, String phoneNumber, int price, int imgId,String commentsAbout){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.price = price;
        this.imgId = imgId;
        this.commentsAbout = commentsAbout;
    }

    public Contact(int id, String name, String phoneNumber, int price, int imgId,String commentsAbout){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.price = price;
        this.imgId = imgId;
        this.commentsAbout = commentsAbout;
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

    public int getPrice() {
        return price;
    }

    public int getImgId() {
        return imgId;
    }

    public String getCommentsAbout() {
        return commentsAbout;
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

    public void setPrice(int price) {
        this.price = price;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public void setCommentsAbout(String commentsAbout) {
        this.commentsAbout = commentsAbout;
    }
}
