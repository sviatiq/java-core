package lesson5.domain;

import lesson5.domain.dao.DaoOperations;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact(2, "Anton", "Fekalis",
                Company.MICROSOFT, "fekalis.a@mail.ru", "790862908978", Department.FACTORY);
        Contact contact3 = new Contact(3, "Vlad", "Galakas",
                Company.MICROSOFT, "dabdabdab@mail.ru", "790740982981", Department.FACTORY);
        Contact contact4 = new Contact(4, "Svetlana", "Nevajno",
                Company.INTEL, "allo.svetlana@mail.ru", "790098787654231", Department.FACTORY);
        Contact contact5 = new Contact(5, "Erich", "Remark",
                Company.APPLE, "remarque@gmail.com", "380988765432", Department.SUPPORT);
        Contact contact6 = new Contact(6, "Alber", "Kamiy",
                Company.APPLE, "alber_kamiy@gmail.com", "380965084902", Department.TECH);
        Contact contact2 = new Contact(1, "Denis", "Petrov",
                Company.INTEL, "p.detrov@mail.ru", "790864212950", Department.TECH);
        Contact contact8 = new Contact(1, "Denis", "Petrov",
                Company.INTEL, "p.detrov@mail.ru", "790864212950", Department.TECH);
        Contact contact9 = new Contact(9, "Pajiloy", "Chak-chak",
                Company.MICROSOFT, "yahochypitsi@gmail.com", "380780967584", Department.SUPPORT);
        Contact contact10 = new Contact(2, "Molodoy", "Vasiiy",
                Company.APPLE, "kosatka@gmail.com", "380987654321", Department.TECH);
        Contact contact7 = new Contact(7, "Yahochy", "Pitsy",
                Company.INTEL, "kavochego@mail.ru", "790098765432", Department.SUPPORT);

        List<Contact> database = new LinkedList();
        DaoOperations daoOperations = new DaoOperations(database);
        daoOperations.saveToDB(contact1);
        daoOperations.saveToDB(contact2);
        daoOperations.saveToDB(contact3);
        daoOperations.saveToDB(contact4);
        daoOperations.saveToDB(contact5);
        daoOperations.saveToDB(contact6);
        daoOperations.saveToDB(contact7);
        daoOperations.saveToDB(contact8);
        daoOperations.saveToDB(contact9);
        daoOperations.saveToDB(contact10);

//donetodo  -знайти всі унікальні контакти
//    database
//            .stream()
//            .distinct()
//            .forEach(System.out::println);

//donetodo  -знайти всі унікальні контакти з певного департаменту.
//       database
//               .stream()
//               .filter(c -> c.getDepartment() == Department.TECH)
//               .forEach(System.out::println);
//donetodo  -знайти всі унікальні контакти з певного департаменту посортувавши їх по імейл.
        database.stream()
                .distinct()
                .sorted(Comparator.comparing(Contact::getEmail))
                .forEach(System.out::println);
//donetodo  -знайти всі унікальні контакти згрупувавши їх по компанії!!!!
//        Map<Company, List<Contact>> collection = database
//                .stream()
//                .distinct()
//                .collect(Collectors.groupingBy(Contact::getCompany));
//        System.out.println(collection);

    }
}
