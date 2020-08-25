package lesson1;

import lesson1.task1.Email;
import lesson1.task1.Person;
import lesson1.task1.Pet;
import lesson1.task2.Company;
import lesson1.task2.Departments;
import lesson1.task2.Workers;
import lesson1.task3.Client;
import lesson1.task3.Order;
import lesson1.task3.OrderType;
import lesson1.task3.Passport;

import java.sql.Date;

public class MainClass {
    public static void main(String[] args) {
        //Task 1
        Pet bucky = new Pet("Bucky", 1);
        bucky.roof();
        //or
        System.out.println(bucky.roofRoof());
        bucky.piss();
        //or
        System.out.println(bucky.pissPiss());

        Email sviatMail = new Email("gmail.com", "sviatdev@gmail.com", "12345sviat");
        sviatMail.login(sviatMail.getLogin(), sviatMail.getPassword());
        System.out.println(sviatMail.loginToAccount(sviatMail.getLogin(), sviatMail.getPassword()));

        Person sviatPerson = new Person("Sviat", "Kogut", 21, sviatMail, bucky);
        System.out.println(sviatPerson);

        //Task 2
        Departments dep1 = new Departments("Frontend Developers");
        Departments dep2 = new Departments("Backend Developers");
        Departments dep3 = new Departments("Marketing");
        Departments[] appleDepartments = {dep1, dep2, dep3};
        Workers appleWorker1 = new Workers("Sviat", "Kogut", 1, "Junior Java Developer");
        Workers appleWorker2 = new Workers("Juliana", "Lubinska", 6, "PR-manager");
        Workers appleWorker3 = new Workers("Vladislav", "Lubinsky", 1, "Junior Angular Delevoper");
        Workers[] appleWorkers = {appleWorker1, appleWorker2, appleWorker3};
        Company appleCompany = new Company("Apple Inc.", appleDepartments, appleWorkers);
        System.out.println(appleCompany);

        //Task 3
        Passport passport1 = new Passport("HP", 214525, "Kyiv");
        Client client1 = new Client("Sviat", "Kogut", Date.valueOf("1999-02-03"));
        Order weddingOrder = new Order(1, Date.valueOf("2020-01-05"), OrderType.WEDDING, client1, passport1);
        System.out.println(weddingOrder);

    }
}
