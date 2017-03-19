package com.sanke46.android.jsontrening;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FeedReaderDBHelper db2 = new FeedReaderDBHelper(this);

        System.out.println("Inserting...");
        db2.addContact(new Contact("Nina", "898100065", 500, 2, "Something about this item"));
        db2.addContact(new Contact("ilya", "898100064", 60, 32, "Something about this item2"));
        System.out.println("Reading all Contacts");

        List<Contact> contacts = db2.getAllContacts();
        for(Contact cn : contacts){
            String log = "Id: " + cn.getId() + ", Name: " + cn.getName() + ", Phone: " + cn.getPhoneNumber() + ", Price: " + cn.getPrice() + ", ImgId: " + cn.getImgId() + ", Comments: " + cn.getCommentsAbout();
            System.out.println(log);
        }
        
    }
}
