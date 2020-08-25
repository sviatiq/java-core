package lesson1.extra_task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person vaysa = new Person(1, "vaysa", 32);
        Person petya = new Person(2, "petya", 31);
        Person kolya = new Person(3, "kolya", 30);
        Person anya = new Person(4, "anya", 29);
        Person masha = new Person(5, "masha", 28);
        Person andriy = new Person(6, "andriy", 30);
        Person maxim = new Person(7, "maxim", 31);
        Person vadym = new Person(8, "vadym", 32);
        Person taras = new Person(9, "taras", 33);

        List listOfPerson = new ArrayList<Person>();
        listOfPerson.add(vaysa);
        listOfPerson.add(petya);
        listOfPerson.add(kolya);
        listOfPerson.add(anya);
        listOfPerson.add(masha);
        listOfPerson.add(andriy);
        listOfPerson.add(maxim);
        listOfPerson.add(vadym);
        listOfPerson.add(taras);

        Auth auth1 = new Auth(5, "login5", "password5");
        Auth auth2 = new Auth(2,"login2","password2");
        Auth auth3 = new Auth(1, "login1", "password1");
        Auth auth4 = new Auth(7, "login7", "password7");
        Auth auth5 = new Auth(3, "login3", "password3");
        Auth auth6 = new Auth(4, "login4", "password4");
        Auth auth7 = new Auth(8, "login8", "password8");
        Auth auth8 = new Auth(6, "login6", "password6");
        Auth auth9 = new Auth(9, "login9", "password9");
        List listOfAuth = new ArrayList<Auth>();
        listOfAuth.add(auth1);
        listOfAuth.add(auth2);
        listOfAuth.add(auth3);
        listOfAuth.add(auth4);
        listOfAuth.add(auth5);
        listOfAuth.add(auth6);
        listOfAuth.add(auth7);
        listOfAuth.add(auth8);
        listOfAuth.add(auth9);

        PersonAuth pa = new PersonAuth();
        PersonAuth pa1 = new PersonAuth();
        pa.personWithAuth(listOfPerson, listOfAuth);


    }
}
