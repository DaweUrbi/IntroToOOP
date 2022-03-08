package assignments.contactList;

import java.util.ArrayList;

public class ContactList {

    ArrayList<Contact> contacts = new ArrayList<Contact>() {
    };

    public ContactList() {
        this.contacts = contacts;
    }

    public ArrayList getContacts() {
        return contacts;
    }

    public void addContact(Contact newContact) {
        contacts.add(newContact);
    }

    public void removeContact(int position) {
        contacts.remove(position);
    }

    public void updateContact(int position, String name, String number, String Company, String workNumber, String city) {
        contacts.get(position).setName(name);
        contacts.get(position).setNumber(number);
        contacts.get(position).setCompany(Company);
        contacts.get(position).setWorkNumber(workNumber);
        contacts.get(position).setCity(city);
    }
}
