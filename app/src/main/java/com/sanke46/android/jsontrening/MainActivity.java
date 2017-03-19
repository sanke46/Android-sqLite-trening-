package com.sanke46.android.jsontrening;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FeedReaderDBHelper db = new FeedReaderDBHelper(this);

        System.out.println("Inserting...");
        db.addContact(new Contact("Nina", "898100065"));
        db.addContact(new Contact("ilya", "898100064"));
        System.out.println("Reading all Contacts");

        List<Contact> contacts = db.getAllContacts();
        for(Contact cn : contacts){
            String log = "Id: " + cn.getId() + ", Name: " + cn.getName() + ", Phone: " + cn.getPhoneNumber();
            System.out.println(log);
        }

        db.deleteAll();

    }
}
