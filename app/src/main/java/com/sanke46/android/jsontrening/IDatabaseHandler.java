package com.sanke46.android.jsontrening;

import java.util.List;

/**
 * Created by ilafedoseev on 14.03.17.
 */

public interface IDatabaseHandler {

    public void addContact(Contact contact);
    public Contact getContact(int id);
    public List<Contact> getAllContacts();
    public int getContactsCount();
    public int updateContact(Contact contact);
    public void deleteContact(Contact contact);
    public void deleteAll();

}
