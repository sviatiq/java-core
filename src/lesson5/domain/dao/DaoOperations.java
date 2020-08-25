package lesson5.domain.dao;

import lesson5.domain.Contact;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DaoOperations {
    private List database = new LinkedList<Contact>();

    public DaoOperations() {
    }

    public DaoOperations(List database) {
        this.database = database;
    }

    public List getDatabase() {
        return database;
    }

    public void setDatabase(List database) {
        this.database = database;
    }

    public void saveToDB(Contact contact){
        database.add(contact);
    }

    @Override
    public String toString() {
        return "DaoOperations{" +
                "database=" + database +
                '}';
    }
}
