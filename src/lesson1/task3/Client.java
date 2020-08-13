package lesson1.task3;

import java.util.Date;

public class Client {
    private String clientName;
    private String clientSurName;
    private Date dateOfBirth;

    public Client() {
    }

    public Client(String clientName, String clientSurName, Date dateOfBirth) {
        this.clientName = clientName;
        this.clientSurName = clientSurName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurName() {
        return clientSurName;
    }

    public void setClientSurName(String clientSurName) {
        this.clientSurName = clientSurName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientSurName='" + clientSurName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
