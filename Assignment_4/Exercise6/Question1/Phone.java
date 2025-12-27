package Assignment_4.Exercise6.Question1;

import java.util.HashMap;
import java.util.Map;


public abstract class Phone {

    private Map<String, String> contacts = new HashMap<>();

    protected Map<String, String> getContacts() {
        return contacts;
    }

    public abstract void insertContact(String name, String phone);
    public abstract void removeContact(String name);
    public abstract void updateContact(String name, String newPhone);
    public abstract void searchContact(String name);
}
